package cn.manytag.iamServiceModule.entity;

import java.io.Serializable;

/**
 * 业务单据  出库实例明细
 * 
 */
public class OutstockInstance implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    /**
     * 主单据id
     */
    private Integer outstockId;

    /**
     * 物资id
     */
    private Integer assetId;

    /**
     * 实例id
     */
    private Integer instanceId;

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOutstockId() {
		return outstockId;
	}

	public void setOutstockId(Integer outstockId) {
		this.outstockId = outstockId;
	}

	public Integer getAssetId() {
		return assetId;
	}

	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}

	public Integer getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(Integer instanceId) {
		this.instanceId = instanceId;
	}

	public Integer getSl() {
		return sl;
	}

	public void setSl(Integer sl) {
		this.sl = sl;
	}

	/**
     * 包装中取出数据量
     */
    private Integer sl;
    
    

    
}