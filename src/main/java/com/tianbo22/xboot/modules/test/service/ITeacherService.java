package com.tianbo22.xboot.modules.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tianbo22.xboot.modules.test.entity.Teacher;

import java.util.List;

/**
 * 测试Teacher接口
 * @author WangCH
 */
public interface ITeacherService extends IService<Teacher> {

    List<Teacher> getTeacherByAge(Integer course);

    Teacher getTeacherById(String id);

    List<Teacher> getTeachersByCondition(Teacher teacher);
}