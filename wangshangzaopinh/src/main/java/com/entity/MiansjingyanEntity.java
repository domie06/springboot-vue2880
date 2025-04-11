package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 面试经验
 *
 * @author 
 * @email
 */
@TableName("miansjingyan")
public class MiansjingyanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MiansjingyanEntity() {

	}

	public MiansjingyanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 面试经验标题
     */
    @TableField(value = "miansjingyan_name")

    private String miansjingyanName;


    /**
     * 封面
     */
    @TableField(value = "miansjingyan_photo")

    private String miansjingyanPhoto;


    /**
     * 工作类型
     */
    @TableField(value = "miansjingyan_types")

    private Integer miansjingyanTypes;


    /**
     * 面试经验详情
     */
    @TableField(value = "miansjingyan_content")

    private String miansjingyanContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：面试经验标题
	 */
    public String getMiansjingyanName() {
        return miansjingyanName;
    }
    /**
	 * 获取：面试经验标题
	 */

    public void setMiansjingyanName(String miansjingyanName) {
        this.miansjingyanName = miansjingyanName;
    }
    /**
	 * 设置：封面
	 */
    public String getMiansjingyanPhoto() {
        return miansjingyanPhoto;
    }
    /**
	 * 获取：封面
	 */

    public void setMiansjingyanPhoto(String miansjingyanPhoto) {
        this.miansjingyanPhoto = miansjingyanPhoto;
    }
    /**
	 * 设置：工作类型
	 */
    public Integer getMiansjingyanTypes() {
        return miansjingyanTypes;
    }
    /**
	 * 获取：工作类型
	 */

    public void setMiansjingyanTypes(Integer miansjingyanTypes) {
        this.miansjingyanTypes = miansjingyanTypes;
    }
    /**
	 * 设置：面试经验详情
	 */
    public String getMiansjingyanContent() {
        return miansjingyanContent;
    }
    /**
	 * 获取：面试经验详情
	 */

    public void setMiansjingyanContent(String miansjingyanContent) {
        this.miansjingyanContent = miansjingyanContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Miansjingyan{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", miansjingyanName=" + miansjingyanName +
            ", miansjingyanPhoto=" + miansjingyanPhoto +
            ", miansjingyanTypes=" + miansjingyanTypes +
            ", miansjingyanContent=" + miansjingyanContent +
            ", createTime=" + createTime +
        "}";
    }
}
