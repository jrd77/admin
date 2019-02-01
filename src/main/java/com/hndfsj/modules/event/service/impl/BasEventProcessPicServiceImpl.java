package com.hndfsj.modules.event.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hndfsj.common.utils.PageUtils;
import com.hndfsj.common.utils.Query;

import com.hndfsj.modules.event.dao.BasEventProcessPicDao;
import com.hndfsj.modules.event.entity.BasEventProcessPicEntity;
import com.hndfsj.modules.event.service.BasEventProcessPicService;


@Service("basEventProcessPicService")
public class BasEventProcessPicServiceImpl extends ServiceImpl<BasEventProcessPicDao, BasEventProcessPicEntity> implements BasEventProcessPicService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BasEventProcessPicEntity> page = this.selectPage(
                new Query<BasEventProcessPicEntity>(params).getPage(),
                new EntityWrapper<BasEventProcessPicEntity>()
        );

        return new PageUtils(page);
    }

}
