package com.tianbo22.xboot.modules.test.serviceimpl;

import com.tianbo22.xboot.modules.test.dao.mapper.TeacherMapper;
import com.tianbo22.xboot.modules.test.entity.Teacher;
import com.tianbo22.xboot.modules.test.service.ITeacherService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mysql.jdbc.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 测试Teacher接口实现
 * @author WangCH
 */
@Slf4j
@Service
@Transactional
public class ITeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> getTeacherByAge(Integer age){
       return teacherMapper.getTeacherByAge(age);
    }

    @Override
    public Teacher getTeacherById(String id) {
        return teacherMapper.selectById(id);
    }

    @Override
    public List<Teacher> getTeachersByCondition(Teacher teacher) {
        QueryWrapper<Teacher> queryWrapper = new QueryWrapper<>();
        if(teacher.getAge() != null){
            queryWrapper.lambda().eq(Teacher::getAge, teacher.getAge());
        }
        if(!StringUtils.isNullOrEmpty(teacher.getName())){
            queryWrapper.lambda().like(Teacher::getName, teacher.getName());
        }
        return teacherMapper.selectList(queryWrapper);
//        return teacherMapper.selectList(new QueryWrapper<Teacher>().lambda()
//                .eq(Teacher::getDelFlag, 0)
//                .eq(Teacher::getAge, teacher.getAge())
//                .likeRight(Teacher::getName,teacher.getName())
//        );
    }


}