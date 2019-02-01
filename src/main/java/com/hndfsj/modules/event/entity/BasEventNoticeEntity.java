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
 * 事件抄送
 *
 * @author W.Z
 * @email ibccmm@gmail.com
 * @date 2019-02-01 15:33:48
 */
@TableName("bas_event_notice")
public class BasEventNoticeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //columns start
            /**
         * 
         */
        public static final String ID="bas_event_notice.id" ;
            /**
         * 事件id
         */
        public static final String EVENTID="bas_event_notice.event_id" ;
            /**
         * 创建人id
         */
        public static final String CREATEID="bas_event_notice.create_id" ;
            /**
         * 内容
         */
        public static final String CONTENT="bas_event_notice.content" ;
            /**
         * 创建时间
         */
        public static final String CREATETIME="bas_event_notice.create_time" ;
            /**
         * 通知人id
         */
        public static final String NOTICEID="bas_event_notice.notice_id" ;
            /**
         * 通知人名字
         */
        public static final String NOTICENAME="bas_event_notice.notice_name" ;
        public static final String TABLENAME = "bas_event_notice" ;
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
         * 创建人id
         */
            @ApiModelProperty(value = "创建人id")
    private Long createId;
            /**
         * 内容
         */
            @ApiModelProperty(value = "内容")
    private String content;
            /**
         * 创建时间
         */
            @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;
            /**
         * 通知人id
         */
            @ApiModelProperty(value = "通知人id")
    private String noticeId;
            /**
         * 通知人名字
         */
            @ApiModelProperty(value = "通知人名字")
    private String noticeName;
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
         * 设置：内容
         */
        public void setContent(String content) {
            this.content = content;
        }

        /**
         * 获取：内容
         */
        public String getContent() {
            return content;
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
         * 设置：通知人id
         */
        public void setNoticeId(String noticeId) {
            this.noticeId = noticeId;
        }

        /**
         * 获取：通知人id
         */
        public String getNoticeId() {
            return noticeId;
        }
            /**
         * 设置：通知人名字
         */
        public void setNoticeName(String noticeName) {
            this.noticeName = noticeName;
        }

        /**
         * 获取：通知人名字
         */
        public String getNoticeName() {
            return noticeName;
        }
    }
