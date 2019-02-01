package com.hndfsj.common.enums;

/**
 * @ClassName TypeEnum
 * @Description 这里是对类的描述
 * @Author wangzhen
 * @Date 2019-2-116:27
 * @Version V0.1
 */
public class TypeEnum {
    public enum UserTypeEnum{
        普通用户(1),开发(2),管理员(3);
        private int type;
        UserTypeEnum(Integer type){
            this.type =type;
        }
        public int getType(){
            return type;
        }
    }
}
