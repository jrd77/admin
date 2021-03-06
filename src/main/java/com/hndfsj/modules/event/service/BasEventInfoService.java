package com.hndfsj.modules.event.service;

import com.baomidou.mybatisplus.service.IService;
import com.hndfsj.common.utils.PageUtils;
import com.hndfsj.modules.event.entity.BasEventInfoEntity;

import java.util.Map;

/**
 * 事件基础信息
 *
 * @author W.Z
 * @email ibccmm@gmail.com
 * @date 2019-02-01 15:33:48
 */
public interface BasEventInfoService extends IService<BasEventInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

