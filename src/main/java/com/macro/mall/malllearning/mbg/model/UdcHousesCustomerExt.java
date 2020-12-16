package com.macro.mall.malllearning.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UdcHousesCustomerExt implements Serializable {
    private Integer dcId;

    private String dataSource;

    @ApiModelProperty(value = "客户guid")
    private String cstGuid;

    @ApiModelProperty(value = "客户名称")
    private String cstName;

    private String cstTel;

    private String projCode;

    @ApiModelProperty(value = "项目guid")
    private String projGuid;

    @ApiModelProperty(value = "项目名称")
    private String projName;

    private String stageCode;

    @ApiModelProperty(value = "分期guid")
    private String stageGuid;

    @ApiModelProperty(value = "分期名称")
    private String stageName;

    @ApiModelProperty(value = "机会guid")
    private String oppGuid;

    @ApiModelProperty(value = "销售跟进类型：0，来电；1，来访；2，小卡；3，验资；4，认筹")
    private String saleType;

    @ApiModelProperty(value = "销售跟进类型状态")
    private String saleStatus;

    @ApiModelProperty(value = "0,原始数据；1，模拟数据")
    private Integer isMock;

    @ApiModelProperty(value = "跟进guid")
    private String gjGuid;

    @ApiModelProperty(value = "跟进时间")
    private Date gjDate;

    @ApiModelProperty(value = "跟进方式")
    private String gjfs;

    @ApiModelProperty(value = "跟进备注")
    private String gjMemo;

    private Date datachangeLasttime;

    private static final long serialVersionUID = 1L;

    public Integer getDcId() {
        return dcId;
    }

    public void setDcId(Integer dcId) {
        this.dcId = dcId;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getCstGuid() {
        return cstGuid;
    }

    public void setCstGuid(String cstGuid) {
        this.cstGuid = cstGuid;
    }

    public String getCstName() {
        return cstName;
    }

    public void setCstName(String cstName) {
        this.cstName = cstName;
    }

    public String getCstTel() {
        return cstTel;
    }

    public void setCstTel(String cstTel) {
        this.cstTel = cstTel;
    }

    public String getProjCode() {
        return projCode;
    }

    public void setProjCode(String projCode) {
        this.projCode = projCode;
    }

    public String getProjGuid() {
        return projGuid;
    }

    public void setProjGuid(String projGuid) {
        this.projGuid = projGuid;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public String getStageCode() {
        return stageCode;
    }

    public void setStageCode(String stageCode) {
        this.stageCode = stageCode;
    }

    public String getStageGuid() {
        return stageGuid;
    }

    public void setStageGuid(String stageGuid) {
        this.stageGuid = stageGuid;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public String getOppGuid() {
        return oppGuid;
    }

    public void setOppGuid(String oppGuid) {
        this.oppGuid = oppGuid;
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public String getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
    }

    public Integer getIsMock() {
        return isMock;
    }

    public void setIsMock(Integer isMock) {
        this.isMock = isMock;
    }

    public String getGjGuid() {
        return gjGuid;
    }

    public void setGjGuid(String gjGuid) {
        this.gjGuid = gjGuid;
    }

    public Date getGjDate() {
        return gjDate;
    }

    public void setGjDate(Date gjDate) {
        this.gjDate = gjDate;
    }

    public String getGjfs() {
        return gjfs;
    }

    public void setGjfs(String gjfs) {
        this.gjfs = gjfs;
    }

    public String getGjMemo() {
        return gjMemo;
    }

    public void setGjMemo(String gjMemo) {
        this.gjMemo = gjMemo;
    }

    public Date getDatachangeLasttime() {
        return datachangeLasttime;
    }

    public void setDatachangeLasttime(Date datachangeLasttime) {
        this.datachangeLasttime = datachangeLasttime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dcId=").append(dcId);
        sb.append(", dataSource=").append(dataSource);
        sb.append(", cstGuid=").append(cstGuid);
        sb.append(", cstName=").append(cstName);
        sb.append(", cstTel=").append(cstTel);
        sb.append(", projCode=").append(projCode);
        sb.append(", projGuid=").append(projGuid);
        sb.append(", projName=").append(projName);
        sb.append(", stageCode=").append(stageCode);
        sb.append(", stageGuid=").append(stageGuid);
        sb.append(", stageName=").append(stageName);
        sb.append(", oppGuid=").append(oppGuid);
        sb.append(", saleType=").append(saleType);
        sb.append(", saleStatus=").append(saleStatus);
        sb.append(", isMock=").append(isMock);
        sb.append(", gjGuid=").append(gjGuid);
        sb.append(", gjDate=").append(gjDate);
        sb.append(", gjfs=").append(gjfs);
        sb.append(", gjMemo=").append(gjMemo);
        sb.append(", datachangeLasttime=").append(datachangeLasttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}