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

import com.hndfsj.modules.event.entity.BasEventPicEntity;
import com.hndfsj.modules.event.service.BasEventPicService;
import com.hndfsj.common.utils.PageUtils;
import com.hndfsj.common.utils.R;



/**
 * 事件的图片信息
 *
 * @author W.Z
 * @email ibccmm@gmail.com
 * @date 2019-02-01 15:33:48
 */
@RestController
@Api(value = "事件的图片信息",tags = "事件的图片信息")
@RequestMapping("event/baseventpic")
@Slf4j
public class BasEventPicController {
    @Autowired
    private BasEventPicService basEventPicService;

    /**
     * 列表
     */
    @GetMapping("/list")
    @ApiOperation(value = "事件的图片信息列表",tags = "事件的图片信息列表")
    @RequiresPermissions("event:baseventpic:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = basEventPicService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "事件的图片信息信息",tags = "事件的图片信息信息")
    @RequiresPermissions("event:baseventpic:info")
    public R info(@PathVariable("id") Long id){
        BasEventPicEntity basEventPic = basEventPicService.selectById(id);

        return R.ok().put("basEventPic", basEventPic);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    @ApiOperation(value = "事件的图片信息保存",tags = "事件的图片信息保存")
    @RequiresPermissions("event:baseventpic:save")
    public R save(@RequestBody @Validated(AddGroup.class) BasEventPicEntity basEventPic){
        basEventPicService.insert(basEventPic);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation(value = "事件的图片信息修改",tags = "事件的图片信息修改")
    @RequiresPermissions("event:baseventpic:update")
    public R update(@RequestBody @Validated(UpdateGroup.class) BasEventPicEntity basEventPic){
        basEventPicService.updateAllColumnById(basEventPic);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation(value = "事件的图片信息删除",tags = "事件的图片信息删除")
    @RequiresPermissions("event:baseventpic:delete")
    public R delete(@RequestBody Long[] ids){
        basEventPicService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
