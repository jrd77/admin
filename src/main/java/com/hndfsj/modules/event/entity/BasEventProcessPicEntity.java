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
 * 事件流程图片
 *
 * @author W.Z
 * @email ibccmm@gmail.com
 * @date 2019-02-01 15:33:48
 */
@TableName("bas_event_process_pic")
public class BasEventProcessPicEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //columns start
            /**
         * 
         */
        public static final String ID="bas_event_process_pic.id" ;
            /**
         * 
         */
        public static final String URL="bas_event_process_pic.url" ;
            /**
         * 
         */
        public static final String CREATEID="bas_event_process_pic.create_id" ;
            /**
         * 
         */
        public static final String PROCESSID="bas_event_process_pic.process_id" ;
            /**
         * 
         */
        public static final String CREATETIME="bas_event_process_pic.create_time" ;
        public static final String TABLENAME = "bas_event_process_pic" ;
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
         * 
         */
            @ApiModelProperty(value = "")
    private String url;
            /**
         * 
         */
            @ApiModelProperty(value = "")
    private String createId;
            /**
         * 
         */
            @ApiModelProperty(value = "")
    private String processId;
            /**
         * 
         */
            @ApiModelProperty(value = "")
    private LocalDateTime createTime;
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
         * 设置：
         */
        public void setUrl(String url) {
            this.url = url;
        }

        /**
         * 获取：
         */
        public String getUrl() {
            return url;
        }
            /**
         * 设置：
         */
        public void setCreateId(String createId) {
            this.createId = createId;
        }

        /**
         * 获取：
         */
        public String getCreateId() {
            return createId;
        }
            /**
         * 设置：
         */
        public void setProcessId(String processId) {
            this.processId = processId;
        }

        /**
         * 获取：
         */
        public String getProcessId() {
            return processId;
        }
            /**
         * 设置：
         */
        public void setCreateTime(LocalDateTime createTime) {
            this.createTime = createTime;
        }

        /**
         * 获取：
         */
        public LocalDateTime getCreateTime() {
            return createTime;
        }
    }
