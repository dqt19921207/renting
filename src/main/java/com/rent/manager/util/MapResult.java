package com.rent.manager.util;


/**
 * @author FRANK
 * @data 2019/1/3 0003 21:01
 */
public class MapResult extends MapContext implements Result {

    /**
     *
     */
    private static final long serialVersionUID = -8312330029787844956L;

    /**
     * 默认成功码
     */
    public static final String DEFAULT_SUCCESS_CODE = "100000";
    /**
     * 默认响应消息
     */
    public static final String DEFAULT_SUCCESS_MESSAGE = "操作成功";

    /**
     * 操作失败
     */
    public static final String DEFAULT_FAIL_CODE = "000000";
    public static final String DEFAULT_FAIL_MSG = "操作失败";

    private String code;
    private String message;
    private boolean isSuccess;

    public MapResult() {
    }

    public MapResult(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    @Override
    public String toJson() {
        return JsonUtil.toJson(this);
    }

    public MapResult(String message) {
        this.message = message;
    }

    public MapResult(boolean isSuccess, String message) {
        this.isSuccess = isSuccess;
        this.message = message;
    }

    public MapResult(String message, String code) {
        this.code = code;
        this.message = message;
    }

    public MapResult(boolean isSuccess, String message, String code) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    @Override
    public boolean isSuccess() {
        return isSuccess;
    }

    @Override
    public void defaultSuccess() {
        setSuccess(true);
        setCode(DEFAULT_SUCCESS_CODE);
        setMessage(DEFAULT_SUCCESS_MESSAGE);
    }


    @Override
    public MapResult defaultFail() {
        defaultFail(DEFAULT_FAIL_MSG);
        return this;
    }

    @Override
    public MapResult defaultFail(String message) {
        this.setSuccess(Boolean.FALSE);
        this.setCode(DEFAULT_FAIL_CODE);
        this.setMessage(message);
        return this;
    }

}
