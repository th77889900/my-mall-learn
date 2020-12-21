package com.macro.mall.malllearning.service.impl;

import com.macro.mall.malllearning.common.utils.JwtTokenUtil;
//import com.macro.mall.malllearning.component.MyPasswordEncoder;
import com.macro.mall.malllearning.mbg.mapper.UmsAdminMapper;
import com.macro.mall.malllearning.mbg.mapper.UmsAdminRoleRelationMapper;
import com.macro.mall.malllearning.mbg.model.UmsAdmin;
import com.macro.mall.malllearning.mbg.model.UmsAdminExample;
import com.macro.mall.malllearning.mbg.model.UmsPermission;
import com.macro.mall.malllearning.service.UmsAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author ：tengu
 * @date ：Created in 2020/11/15 7:58 下午
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);
//    @Autowired
//    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
//    @Autowired
//    private MyPasswordEncoder passwordEncoder;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Resource
    private UmsAdminMapper adminMapper;
    @Resource
    private UmsAdminRoleRelationMapper adminRoleRelationMapper;

    @Override
    public UmsAdmin getAdminByUsername(String username) {
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UmsAdmin> adminList = adminMapper.selectByExample(example);
        if (adminList != null && adminList.size() > 0) {
            return adminList.get(0);
        }
        return null;
    }

    @Override
    public UmsAdmin register(UmsAdmin umsAdminParam) {
        UmsAdmin umsAdmin = new UmsAdmin();
        BeanUtils.copyProperties(umsAdminParam, umsAdmin);
        umsAdmin.setCreateTime(new Date());
        umsAdmin.setStatus(1);
        //查询是否有相同用户名的用户
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(umsAdmin.getUsername());
        List<UmsAdmin> umsAdminList = adminMapper.selectByExample(example);
        if (umsAdminList.size() > 0) {
            return null;
        }
        //将密码进行加密操作
//        String encodePassword = passwordEncoder.encode(umsAdmin.getPassword());
//        umsAdmin.setPassword(encodePassword);
        adminMapper.insert(umsAdmin);
        return umsAdmin;
    }

//    @Override
//    public String login(String username, String password) {
//        String token = null;
//        try {
//            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
//                throw new BadCredentialsException("密码不正确");
//            }
//            UsernamePasswordAuthenticationToken authentication =
//                    new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//            token = jwtTokenUtil.generateToken(userDetails);
//        } catch (AuthenticationException e) {
//            LOGGER.warn("登录异常:{}", e.getMessage());
//        }
//        return token;
//    }


    @Override
    public List<UmsPermission> getPermissionList(Long adminId) {

        return adminRoleRelationMapper.getPermissionList(adminId);
    }

}
