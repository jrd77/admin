package com.hndfsj.modules.event.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hndfsj.common.utils.PageUtils;
import com.hndfsj.common.utils.Query;

import com.hndfsj.modules.event.dao.BasEventPicDao;
import com.hndfsj.modules.event.entity.BasEventPicEntity;
import com.hndfsj.modules.event.service.BasEventPicService;


@Service("basEventPicService")
public class BasEventPicServiceImpl extends ServiceImpl<BasEventPicDao, BasEventPicEntity> implements BasEventPicService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BasEventPicEntity> page = this.selectPage(
                new Query<BasEventPicEntity>(params).getPage(),
                new EntityWrapper<BasEventPicEntity>()
        );

        return new PageUtils(page);
    }

}
