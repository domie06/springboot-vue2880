package com.entity.model;

import com.entity.MiansjingyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 面试经验
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class MiansjingyanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 面试经验标题
     */
    private String miansjingyanName;


    /**
     * 封面
     */
    private String miansjingyanPhoto;


    /**
     * 工作类型
     */
    private Integer miansjingyanTypes;


    /**
     * 面试经验详情
     */
    private String miansjingyanContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：面试经验标题
	 */
    public String getMiansjingyanName() {
        return miansjingyanName;
    }


    /**
	 * 设置：面试经验标题
	 */
    public void setMiansjingyanName(String miansjingyanName) {
        this.miansjingyanName = miansjingyanName;
    }
    /**
	 * 获取：封面
	 */
    public String getMiansjingyanPhoto() {
        return miansjingyanPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setMiansjingyanPhoto(String miansjingyanPhoto) {
        this.miansjingyanPhoto = miansjingyanPhoto;
    }
    /**
	 * 获取：工作类型
	 */
    public Integer getMiansjingyanTypes() {
        return miansjingyanTypes;
    }


    /**
	 * 设置：工作类型
	 */
    public void setMiansjingyanTypes(Integer miansjingyanTypes) {
        this.miansjingyanTypes = miansjingyanTypes;
    }
    /**
	 * 获取：面试经验详情
	 */
    public String getMiansjingyanContent() {
        return miansjingyanContent;
    }


    /**
	 * 设置：面试经验详情
	 */
    public void setMiansjingyanContent(String miansjingyanContent) {
        this.miansjingyanContent = miansjingyanContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
