package com.single.pro.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author SiZhongxia
 * @since 2018-01-25
 */
@TableName("sp_role_authorization")
public class RoleAuthorization implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	private Long id;
    /**
     * 角色ID
     */
	@TableField("role_id")
	private Long roleId;
    /**
     * 权限关联
     */
	@TableField("authword_id")
	private Long authwordId;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getAuthwordId() {
		return authwordId;
	}

	public void setAuthwordId(Long authwordId) {
		this.authwordId = authwordId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "RoleAuthorization{" +
			", id=" + id +
			", roleId=" + roleId +
			", authwordId=" + authwordId +
			", createTime=" + createTime +
			"}";
	}
}
