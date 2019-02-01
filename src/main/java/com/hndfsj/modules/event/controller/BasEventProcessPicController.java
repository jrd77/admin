package com.hndfsj.modules.event.controller;

import java.util.Arrays;
import java.util.Map;
import com.hndfsj.common.validator.group.AddGroup;
import com.hndfsj.common.validator.group.UpdateGroup;
import org.springframework.validation.annotation.Validated;
import com.hndfsj.common.validator.ValidatorUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

import com.hndfsj.modules.event.entity.BasEventProcessPicEntity;
import com.hndfsj.modules.event.service.BasEventProcessPicService;
import com.hndfsj.common.utils.PageUtils;
import com.hndfsj.common.utils.R;



/**
 * 事件流程图片
 *
 * @author W.Z
 * @email ibccmm@gmail.com
 * @date 2019-02-01 15:33:48
 */
@RestController
@Api(value = "事件流程图片",tags = "事件流程图片")
@RequestMapping("event/baseventprocesspic")
@Slf4j
public class BasEventProcessPicController {
    @Autowired
    private BasEventProcessPicService basEventProcessPicService;

    /**
     * 列表
     */
    @GetMapping("/list")
    @ApiOperation(value = "事件流程图片列表",tags = "事件流程图片列表")
    @RequiresPermissions("event:baseventprocesspic:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = basEventProcessPicService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "事件流程图片信息",tags = "事件流程图片信息")
    @RequiresPermissions("event:baseventprocesspic:info")
    public R info(@PathVariable("id") Long id){
        BasEventProcessPicEntity basEventProcessPic = basEventProcessPicService.selectById(id);

        return R.ok().put("basEventProcessPic", basEventProcessPic);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    @ApiOperation(value = "事件流程图片保存",tags = "事件流程图片保存")
    @RequiresPermissions("event:baseventprocesspic:save")
    public R save(@RequestBody @Validated(AddGroup.class) BasEventProcessPicEntity basEventProcessPic){
        basEventProcessPicService.insert(basEventProcessPic);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation(value = "事件流程图片修改",tags = "事件流程图片修改")
    @RequiresPermissions("event:baseventprocesspic:update")
    public R update(@RequestBody @Validated(UpdateGroup.class) BasEventProcessPicEntity basEventProcessPic){
        basEventProcessPicService.updateAllColumnById(basEventProcessPic);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation(value = "事件流程图片删除",tags = "事件流程图片删除")
    @RequiresPermissions("event:baseventprocesspic:delete")
    public R delete(@RequestBody Long[] ids){
        basEventProcessPicService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
