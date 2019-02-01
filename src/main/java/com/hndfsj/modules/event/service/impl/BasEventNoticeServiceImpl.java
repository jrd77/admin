package com.hndfsj.modules.event.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hndfsj.common.utils.PageUtils;
import com.hndfsj.common.utils.Query;

import com.hndfsj.modules.event.dao.BasEventNoticeDao;
import com.hndfsj.modules.event.entity.BasEventNoticeEntity;
import com.hndfsj.modules.event.service.BasEventNoticeService;


@Service("basEventNoticeService")
public class BasEventNoticeServiceImpl extends ServiceImpl<BasEventNoticeDao, BasEventNoticeEntity> implements BasEventNoticeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BasEventNoticeEntity> page = this.selectPage(
                new Query<BasEventNoticeEntity>(params).getPage(),
                new EntityWrapper<BasEventNoticeEntity>()
        );

        return new PageUtils(page);
    }

}
