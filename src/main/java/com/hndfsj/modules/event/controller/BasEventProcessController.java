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

import com.hndfsj.modules.event.entity.BasEventProcessEntity;
import com.hndfsj.modules.event.service.BasEventProcessService;
import com.hndfsj.common.utils.PageUtils;
import com.hndfsj.common.utils.R;



/**
 * 事件流程
 *
 * @author W.Z
 * @email ibccmm@gmail.com
 * @date 2019-02-01 15:33:48
 */
@RestController
@Api(value = "事件流程",tags = "事件流程")
@RequestMapping("event/baseventprocess")
@Slf4j
public class BasEventProcessController {
    @Autowired
    private BasEventProcessService basEventProcessService;

    /**
     * 列表
     */
    @GetMapping("/list")
    @ApiOperation(value = "事件流程列表",tags = "事件流程列表")
    @RequiresPermissions("event:baseventprocess:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = basEventProcessService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "事件流程信息",tags = "事件流程信息")
    @RequiresPermissions("event:baseventprocess:info")
    public R info(@PathVariable("id") Long id){
        BasEventProcessEntity basEventProcess = basEventProcessService.selectById(id);

        return R.ok().put("basEventProcess", basEventProcess);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    @ApiOperation(value = "事件流程保存",tags = "事件流程保存")
    @RequiresPermissions("event:baseventprocess:save")
    public R save(@RequestBody @Validated(AddGroup.class) BasEventProcessEntity basEventProcess){
        basEventProcessService.insert(basEventProcess);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation(value = "事件流程修改",tags = "事件流程修改")
    @RequiresPermissions("event:baseventprocess:update")
    public R update(@RequestBody @Validated(UpdateGroup.class) BasEventProcessEntity basEventProcess){
        basEventProcessService.updateAllColumnById(basEventProcess);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation(value = "事件流程删除",tags = "事件流程删除")
    @RequiresPermissions("event:baseventprocess:delete")
    public R delete(@RequestBody Long[] ids){
        basEventProcessService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
