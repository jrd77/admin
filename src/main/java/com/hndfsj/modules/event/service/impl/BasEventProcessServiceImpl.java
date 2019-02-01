package com.hndfsj.modules.event.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hndfsj.common.utils.PageUtils;
import com.hndfsj.common.utils.Query;

import com.hndfsj.modules.event.dao.BasEventProcessDao;
import com.hndfsj.modules.event.entity.BasEventProcessEntity;
import com.hndfsj.modules.event.service.BasEventProcessService;


@Service("basEventProcessService")
public class BasEventProcessServiceImpl extends ServiceImpl<BasEventProcessDao, BasEventProcessEntity> implements BasEventProcessService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BasEventProcessEntity> page = this.selectPage(
                new Query<BasEventProcessEntity>(params).getPage(),
                new EntityWrapper<BasEventProcessEntity>()
        );

        return new PageUtils(page);
    }

}
