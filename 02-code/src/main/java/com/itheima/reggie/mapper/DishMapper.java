package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author liming
 * @Date 2023/4/26 16:21
 **/
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
