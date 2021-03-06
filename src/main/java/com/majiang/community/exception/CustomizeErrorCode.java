package com.majiang.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTOIN_NOT_FOUND(2001,"你访问的问题不在了，要不换个试试？"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题或评论进行回复。"),
    NO_LOGIN(2003,"当前操作需要登录，请登录再试。"),
    SYS_ERROR(2004,"服务冒烟了,请稍后重试"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或者不存在"),
    COMMENT_NOT_FOUND(2006,"回复的评论不存在了，要不换个试试"),
    COMMENT_COTENT_NOT_EMPTY(2007,"评论内容不能为空"),
    READ_NOTIFICATION_FAIL(2008,"兄弟你这是查看了别人的信息？"),
    NOTIFICATION_NOT_FOUND(2009,"消息莫非不翼而飞啦？");


    private String message;
    private Integer code;
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    CustomizeErrorCode(Integer code,String message) {
        this.code=code;
        this.message = message;
    }
}
