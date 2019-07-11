package com.tianbo22.xboot.modules.test.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tianbo22.xboot.modules.test.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 测试Teacher数据处理层
 * @author WangCH
 */
@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {

    /** 根据年龄获取老师List
     * @param age
     * @return
     */
    @Select("select * from t_teacher where age = #{age} and del_flag = 0")
    List<Teacher> getTeacherByAge(@Param("age") Integer age);

}