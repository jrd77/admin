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
 * 事件流程
 *
 * @author W.Z
 * @email ibccmm@gmail.com
 * @date 2019-02-01 15:33:48
 */
@TableName("bas_event_process")
public class BasEventProcessEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //columns start
            /**
         * 
         */
        public static final String ID="bas_event_process.id" ;
            /**
         * 事件id
         */
        public static final String EVENTID="bas_event_process.event_id" ;
            /**
         * 创建时间
         */
        public static final String CREATETIME="bas_event_process.create_time" ;
            /**
         * 修改时间
         */
        public static final String MODIFYTIME="bas_event_process.modify_time" ;
            /**
         * 创建人id
         */
        public static final String CREATEID="bas_event_process.create_id" ;
            /**
         * 备注
         */
        public static final String MARKNOTE="bas_event_process.mark_note" ;
            /**
         * 1 转办 0.结束流程
         */
        public static final String STATUS="bas_event_process.status" ;
            /**
         * 下一个转办人
         */
        public static final String NEXTPERSON="bas_event_process.next_person" ;
            /**
         * 转办流程id
         */
        public static final String NEXTPROCESSID="bas_event_process.next_process_id" ;
        public static final String TABLENAME = "bas_event_process" ;
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
         * 事件id
         */
            @ApiModelProperty(value = "事件id")
    private String eventId;
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
    private Long createId;
            /**
         * 备注
         */
            @ApiModelProperty(value = "备注")
    private String markNote;
            /**
         * 1 转办 0.结束流程
         */
            @ApiModelProperty(value = "1 转办 0.结束流程")
    private Integer status;
            /**
         * 下一个转办人
         */
            @ApiModelProperty(value = "下一个转办人")
    private String nextPerson;
            /**
         * 转办流程id
         */
            @ApiModelProperty(value = "转办流程id")
    private String nextProcessId;
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
         * 设置：事件id
         */
        public void setEventId(String eventId) {
            this.eventId = eventId;
        }

        /**
         * 获取：事件id
         */
        public String getEventId() {
            return eventId;
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
        public void setCreateId(Long createId) {
            this.createId = createId;
        }

        /**
         * 获取：创建人id
         */
        public Long getCreateId() {
            return createId;
        }
            /**
         * 设置：备注
         */
        public void setMarkNote(String markNote) {
            this.markNote = markNote;
        }

        /**
         * 获取：备注
         */
        public String getMarkNote() {
            return markNote;
        }
            /**
         * 设置：1 转办 0.结束流程
         */
        public void setStatus(Integer status) {
            this.status = status;
        }

        /**
         * 获取：1 转办 0.结束流程
         */
        public Integer getStatus() {
            return status;
        }
            /**
         * 设置：下一个转办人
         */
        public void setNextPerson(String nextPerson) {
            this.nextPerson = nextPerson;
        }

        /**
         * 获取：下一个转办人
         */
        public String getNextPerson() {
            return nextPerson;
        }
            /**
         * 设置：转办流程id
         */
        public void setNextProcessId(String nextProcessId) {
            this.nextProcessId = nextProcessId;
        }

        /**
         * 获取：转办流程id
         */
        public String getNextProcessId() {
            return nextProcessId;
        }
    }
