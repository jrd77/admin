package com.hndfsj.common.enums;

/**
 * @ClassName StatusEnum
 * @Description 这里是对类的描述
 * @Author wangzhen
 * @Date 2019-2-116:16
 * @Version V0.1
 */
public class StatusEnum {
    public enum EventStatus{
        已上报(1),处置中(2),已完成(3);
        private int status;
        EventStatus(Integer status){
            this.status=status;
        }
        public int getStatus(){
            return status;
        }
    }
}
