package com.single.pro.entity;

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
@TableName("sp_authorization")
public class Authorization implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	private Long id;
    /**
     * 权限字名称
     */
	private String name;
    /**
     * 权限字编码
     */
	private String code;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Authorization{" +
			", id=" + id +
			", name=" + name +
			", code=" + code +
			"}";
	}
}
