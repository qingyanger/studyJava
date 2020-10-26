package com.db.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统运营指标表详情表
 * </p>
 *
 * @author victor
 * @since 2020-10-26
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("sys_quota_plan_detail")
public class SysQuotaPlanDetail extends Model<SysQuotaPlanDetail> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 运行指标id
     */
	@TableField("quota_plan_id")
	private Integer quotaPlanId;
    /**
     * 指标项名称
     */
	@TableField("plan_node_name")
	private String planNodeName;
    /**
     * 指标单位
     */
	@TableField("plan_node_unit")
	private String planNodeUnit;
    /**
     * 指标值
     */
	@TableField("plan_node_val")
	private Double planNodeVal;
	@TableField("dept_id")
	private String deptId;
	@TableField("company_id")
	private Long companyId;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * 更新时间
     */
	@TableField("update_time")
	private Date updateTime;


	public static final String ID = "id";

	public static final String QUOTA_PLAN_ID = "quota_plan_id";

	public static final String PLAN_NODE_NAME = "plan_node_name";

	public static final String PLAN_NODE_UNIT = "plan_node_unit";

	public static final String PLAN_NODE_VAL = "plan_node_val";

	public static final String DEPT_ID = "dept_id";

	public static final String COMPANY_ID = "company_id";

	public static final String CREATE_TIME = "create_time";

	public static final String UPDATE_TIME = "update_time";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
