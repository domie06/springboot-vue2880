package com.dao;

import com.entity.MiansjingyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MiansjingyanView;

/**
 * 面试经验 Dao 接口
 *
 * @author 
 */
public interface MiansjingyanDao extends BaseMapper<MiansjingyanEntity> {

   List<MiansjingyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
