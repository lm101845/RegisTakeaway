package com.itheima.reggie.common;

/**
 * @Author liming
 * @Date 2023/4/26 16:44
 **/

/**
 * 自定义业务异常
 */
public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
