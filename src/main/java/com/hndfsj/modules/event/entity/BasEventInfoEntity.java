package com.hndfsj.modules.event.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;


import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import com.hndfsj.common.validator.group.AddGroup;
import com.hndfsj.common.validator.group.UpdateGroup;
    import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 事件基础信息
 *
 * @author W.Z
 * @email ibccmm@gmail.com
 * @date 2019-02-01 15:33:48
 */
@TableName("bas_event_info")
public class BasEventInfoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //columns start
            /**
         * 
         */
        public static final String ID="bas_event_info.id" ;
            /**
         * 标题
         */
        public static final String TITLE="bas_event_info.title" ;
            /**
         * 事件内容
         */
        public static final String CONTENT="bas_event_info.content" ;
            /**
         * 事件类型 1保洁 2保修 3 其他
         */
        public static final String TYPE="bas_event_info.type" ;
            /**
         * 状态 1.上报 2.处置中 3已结束
         */
        public static final String STATUS="bas_event_info.status" ;
            /**
         * 创建时间
         */
        public static final String CREATETIME="bas_event_info.create_time" ;
            /**
         * 修改时间
         */
        public static final String MODIFYTIME="bas_event_info.modify_time" ;
            /**
         * 创建人id
         */
        public static final String CREATEID="bas_event_info.create_id" ;
            /**
         * 
         */
        public static final String CREATOR="bas_event_info.creator" ;
        public static final String TABLENAME = "bas_event_info" ;
    //columns end

    //columnField start
            /**
         * 
         */
                @TableId
        @NotNull(message = "id在修改时不能为空", groups = UpdateGroup.class)
            @ApiModelProperty(value = "")
    private Long id;
            /**
         * 标题
         */
            @ApiModelProperty(value = "标题")
    private String title;
            /**
         * 事件内容
         */
            @ApiModelProperty(value = "事件内容")
    private String content;
            /**
         * 事件类型 1保洁 2保修 3 其他
         */
            @ApiModelProperty(value = "事件类型 1保洁 2保修 3 其他")
    private Integer type;
            /**
         * 状态 1.上报 2.处置中 3已结束
         */
            @ApiModelProperty(value = "状态 1.上报 2.处置中 3已结束")
    private Integer status;
            /**
         * 创建时间
         */
            @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;
            /**
         * 修改时间
         */
            @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyTime;
            /**
         * 创建人id
         */
            @ApiModelProperty(value = "创建人id")
    private String createId;
            /**
         * 
         */
            @ApiModelProperty(value = "")
    private String creator;
        //columnField end


            /**
         * 设置：
         */
        public void setId(Long id) {
            this.id = id;
        }

        /**
         * 获取：
         */
        public Long getId() {
            return id;
        }
            /**
         * 设置：标题
         */
        public void setTitle(String title) {
            this.title = title;
        }

        /**
         * 获取：标题
         */
        public String getTitle() {
            return title;
        }
            /**
         * 设置：事件内容
         */
        public void setContent(String content) {
            this.content = content;
        }

        /**
         * 获取：事件内容
         */
        public String getContent() {
            return content;
        }
            /**
         * 设置：事件类型 1保洁 2保修 3 其他
         */
        public void setType(Integer type) {
            this.type = type;
        }

        /**
         * 获取：事件类型 1保洁 2保修 3 其他
         */
        public Integer getType() {
            return type;
        }
            /**
         * 设置：状态 1.上报 2.处置中 3已结束
         */
        public void setStatus(Integer status) {
            this.status = status;
        }

        /**
         * 获取：状态 1.上报 2.处置中 3已结束
         */
        public Integer getStatus() {
            return status;
        }
            /**
         * 设置：创建时间
         */
        public void setCreateTime(LocalDateTime createTime) {
            this.createTime = createTime;
        }

        /**
         * 获取：创建时间
         */
        public LocalDateTime getCreateTime() {
            return createTime;
        }
            /**
         * 设置：修改时间
         */
        public void setModifyTime(LocalDateTime modifyTime) {
            this.modifyTime = modifyTime;
        }

        /**
         * 获取：修改时间
         */
        public LocalDateTime getModifyTime() {
            return modifyTime;
        }
            /**
         * 设置：创建人id
         */
        public void setCreateId(String createId) {
            this.createId = createId;
        }

        /**
         * 获取：创建人id
         */
        public String getCreateId() {
            return createId;
        }
            /**
         * 设置：
         */
        public void setCreator(String creator) {
            this.creator = creator;
        }

        /**
         * 获取：
         */
        public String getCreator() {
            return creator;
        }
    }
