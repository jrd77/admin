package com.hndfsj.modules.event.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hndfsj.common.utils.PageUtils;
import com.hndfsj.common.utils.Query;

import com.hndfsj.modules.event.dao.BasEventInfoDao;
import com.hndfsj.modules.event.entity.BasEventInfoEntity;
import com.hndfsj.modules.event.service.BasEventInfoService;


@Service("basEventInfoService")
public class BasEventInfoServiceImpl extends ServiceImpl<BasEventInfoDao, BasEventInfoEntity> implements BasEventInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BasEventInfoEntity> page = this.selectPage(
                new Query<BasEventInfoEntity>(params).getPage(),
                new EntityWrapper<BasEventInfoEntity>()
        );

        return new PageUtils(page);
    }

}
