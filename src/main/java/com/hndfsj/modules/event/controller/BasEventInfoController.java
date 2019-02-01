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

import com.hndfsj.modules.event.entity.BasEventInfoEntity;
import com.hndfsj.modules.event.service.BasEventInfoService;
import com.hndfsj.common.utils.PageUtils;
import com.hndfsj.common.utils.R;



/**
 * 事件基础信息
 *
 * @author W.Z
 * @email ibccmm@gmail.com
 * @date 2019-02-01 15:33:48
 */
@RestController
@Api(value = "事件基础信息",tags = "事件基础信息")
@RequestMapping("event/baseventinfo")
@Slf4j
public class BasEventInfoController {
    @Autowired
    private BasEventInfoService basEventInfoService;

    /**
     * 列表
     */
    @GetMapping("/list")
    @ApiOperation(value = "事件基础信息列表",tags = "事件基础信息列表")
    @RequiresPermissions("event:baseventinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = basEventInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "事件基础信息信息",tags = "事件基础信息信息")
    @RequiresPermissions("event:baseventinfo:info")
    public R info(@PathVariable("id") Long id){
        BasEventInfoEntity basEventInfo = basEventInfoService.selectById(id);

        return R.ok().put("basEventInfo", basEventInfo);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    @ApiOperation(value = "事件基础信息保存",tags = "事件基础信息保存")
    @RequiresPermissions("event:baseventinfo:save")
    public R save(@RequestBody @Validated(AddGroup.class) BasEventInfoEntity basEventInfo){
        basEventInfoService.insert(basEventInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation(value = "事件基础信息修改",tags = "事件基础信息修改")
    @RequiresPermissions("event:baseventinfo:update")
    public R update(@RequestBody @Validated(UpdateGroup.class) BasEventInfoEntity basEventInfo){
        basEventInfoService.updateAllColumnById(basEventInfo);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation(value = "事件基础信息删除",tags = "事件基础信息删除")
    @RequiresPermissions("event:baseventinfo:delete")
    public R delete(@RequestBody Long[] ids){
        basEventInfoService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
