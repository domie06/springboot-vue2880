package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MiansjingyanCollectionEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 面试经验收藏 服务类
 */
public interface MiansjingyanCollectionService extends IService<MiansjingyanCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}