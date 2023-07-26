package com.kubertX.mallX.admin.dto;


import lombok.Data;

@Data
public class CommonResult {

    /**
     * 状态码
     */
    private long code;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 数据封装
     */
    private Object data;

    public CommonResult(){}

    public CommonResult(long code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
