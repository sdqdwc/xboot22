package com.tianbo22.xboot.modules.test.controller;

import com.tianbo22.xboot.common.utils.PageUtil;
import com.tianbo22.xboot.common.utils.ResultUtil;
import com.tianbo22.xboot.common.vo.PageVo;
import com.tianbo22.xboot.common.vo.Result;
import com.tianbo22.xboot.modules.test.entity.Teacher;
import com.tianbo22.xboot.modules.test.service.ITeacherService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author WangCH
 */
@Slf4j
@RestController
@Api(description = "测试Teacher管理接口")
@RequestMapping("/xboot/teacher")
@Transactional
public class TeacherController {

    @Autowired
    private ITeacherService iTeacherService;

    /**
     * 根据年龄获取教师信息
     * @param age
     * @return
     */
    @RequestMapping(value = "/getTeacherByAge",method = RequestMethod.GET)
    @ApiOperation(value = "根据课程获取教师信息")
    public Result<List<Teacher>> getTeacherByAge(@RequestParam Integer age){
        List<Teacher> list = iTeacherService.getTeacherByAge(age);
        return new ResultUtil<List<Teacher>>().setData(list);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "通过id获取")
    public Result<Teacher> get(@PathVariable String id){

        Teacher teacher = iTeacherService.getById(id);
        return new ResultUtil<Teacher>().setData(teacher);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ApiOperation(value = "获取全部数据")
    public Result<List<Teacher>> getAll(){

        List<Teacher> list = iTeacherService.list();
        return new ResultUtil<List<Teacher>>().setData(list);
    }

    @RequestMapping(value = "/getByPage", method = RequestMethod.GET)
    @ApiOperation(value = "分页获取")
    public Result<IPage<Teacher>> getByPage(@ModelAttribute PageVo page){

        IPage<Teacher> data = iTeacherService.page(PageUtil.initMpPage(page));
        return new ResultUtil<IPage<Teacher>>().setData(data);
    }

    @RequestMapping(value = "/insertOrUpdate", method = RequestMethod.POST)
    @ApiOperation(value = "编辑或更新数据")
    public Result<Teacher> saveOrUpdate(@ModelAttribute Teacher teacher){

        if(iTeacherService.saveOrUpdate(teacher)){
            return new ResultUtil<Teacher>().setData(teacher);
        }
        return new ResultUtil<Teacher>().setErrorMsg("操作失败");
    }

    @RequestMapping(value = "/delByIds/{ids}", method = RequestMethod.DELETE)
    @ApiOperation(value = "批量通过id删除")
    public Result<Object> delAllByIds(@PathVariable String[] ids){

        for(String id : ids){
            iTeacherService.removeById(id);
        }
        return new ResultUtil<>().setSuccessMsg("批量通过id删除数据成功");
    }


    @RequestMapping(value = "/getTeachersByCondition", method = RequestMethod.GET)
    @ApiOperation(value = "根据条件查找老师列表")
    public Result<List<Teacher>> getTeachersByCondition(Teacher teacher){
        List<Teacher> list = iTeacherService.getTeachersByCondition(teacher);
        return new ResultUtil<List<Teacher>>().setData(list);
    }


}
