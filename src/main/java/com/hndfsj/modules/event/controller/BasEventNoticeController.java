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

import com.hndfsj.modules.event.entity.BasEventNoticeEntity;
import com.hndfsj.modules.event.service.BasEventNoticeService;
import com.hndfsj.common.utils.PageUtils;
import com.hndfsj.common.utils.R;



/**
 * 事件抄送
 *
 * @author W.Z
 * @email ibccmm@gmail.com
 * @date 2019-02-01 15:33:48
 */
@RestController
@Api(value = "事件抄送",tags = "事件抄送")
@RequestMapping("event/baseventnotice")
@Slf4j
public class BasEventNoticeController {
    @Autowired
    private BasEventNoticeService basEventNoticeService;

    /**
     * 列表
     */
    @GetMapping("/list")
    @ApiOperation(value = "事件抄送列表",tags = "事件抄送列表")
    @RequiresPermissions("event:baseventnotice:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = basEventNoticeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "事件抄送信息",tags = "事件抄送信息")
    @RequiresPermissions("event:baseventnotice:info")
    public R info(@PathVariable("id") Long id){
        BasEventNoticeEntity basEventNotice = basEventNoticeService.selectById(id);

        return R.ok().put("basEventNotice", basEventNotice);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    @ApiOperation(value = "事件抄送保存",tags = "事件抄送保存")
    @RequiresPermissions("event:baseventnotice:save")
    public R save(@RequestBody @Validated(AddGroup.class) BasEventNoticeEntity basEventNotice){
        basEventNoticeService.insert(basEventNotice);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation(value = "事件抄送修改",tags = "事件抄送修改")
    @RequiresPermissions("event:baseventnotice:update")
    public R update(@RequestBody @Validated(UpdateGroup.class) BasEventNoticeEntity basEventNotice){
        basEventNoticeService.updateAllColumnById(basEventNotice);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation(value = "事件抄送删除",tags = "事件抄送删除")
    @RequiresPermissions("event:baseventnotice:delete")
    public R delete(@RequestBody Long[] ids){
        basEventNoticeService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
