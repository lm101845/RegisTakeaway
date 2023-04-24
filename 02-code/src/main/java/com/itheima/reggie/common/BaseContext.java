package com.itheima.reggie.common;

/**
 * @Author liming
 * @Date 2023/4/24 15:40
 **/

/**
 * 基于ThreadLocal封装的工具类，用于保存和获取当前登录的用户id
 * 它的作用范围是每一个线程之内(每次请求都是一个新的线程，不会有冲突)
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置值
     * @param id
     */
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    /**
     * 获取值
     * @return
     */
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
