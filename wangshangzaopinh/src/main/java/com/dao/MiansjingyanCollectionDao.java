package com.dao;

import com.entity.MiansjingyanCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MiansjingyanCollectionView;

/**
 * 面试经验收藏 Dao 接口
 *
 * @author 
 */
public interface MiansjingyanCollectionDao extends BaseMapper<MiansjingyanCollectionEntity> {

   List<MiansjingyanCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
