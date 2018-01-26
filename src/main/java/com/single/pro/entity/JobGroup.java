package com.single.pro.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 定时任务组
 * </p>
 *
 * @author SiZhongxia
 * @since 2018-01-25
 */
@TableName("sp_job_group")
public class JobGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
	private Long id;
    /**
     * 任务（作业）组编码
     */
	@TableField("group_code")
	private String groupCode;
    /**
     * 任务（作业）组名称
     */
	@TableField("group_name")
	private String groupName;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "JobGroup{" +
			", id=" + id +
			", groupCode=" + groupCode +
			", groupName=" + groupName +
			"}";
	}
}
