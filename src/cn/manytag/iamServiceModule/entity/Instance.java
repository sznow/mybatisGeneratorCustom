package cn.manytag.iamServiceModule.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 业务结果 
资产实例
 * 
 * @author wcyong
 * 
 * @date 2019-08-13
 */
public class Instance {
    private Long id;

    private Long orgId;

    /**
     * 资产id
     */
    private Long assetId;

    /**
     * 编号（rfid标识），机构内唯一标识
     */
    private String code;

    /**
     * 停用——批次id
     */
    private Long ty_batchId;

    /**
     * 位置id
     */
    private Long placeId;

    /**
     * 领用人，如果是包没有领用人
     */
    private Long userId;

    /**
     * 是否包
     */
    private Boolean isPackage;

    /**
     * 包装中数量
     */
    private Integer sl;

    /**
     * 单价
     */
    private BigDecimal price;

    private String memo;

    private Long createUser;

    private Date createTime;

    private Long updateUser;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getAssetId() {
        return assetId;
    }

    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Long getTy_batchId() {
        return ty_batchId;
    }

    public void setTy_batchId(Long ty_batchId) {
        this.ty_batchId = ty_batchId;
    }

    public Long getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Boolean getIsPackage() {
        return isPackage;
    }

    public void setIsPackage(Boolean isPackage) {
        this.isPackage = isPackage;
    }

    public Integer getSl() {
        return sl;
    }

    public void setSl(Integer sl) {
        this.sl = sl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}