package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author liming
 * @Date 2023/4/17 20:41
 **/

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
