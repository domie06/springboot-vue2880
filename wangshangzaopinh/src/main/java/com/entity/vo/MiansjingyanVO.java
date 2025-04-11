package com.entity.vo;

import com.entity.MiansjingyanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 面试经验
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("miansjingyan")
public class MiansjingyanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
