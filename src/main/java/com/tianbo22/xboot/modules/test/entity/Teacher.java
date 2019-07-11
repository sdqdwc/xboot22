package com.tianbo22.xboot.modules.test.entity;

import com.tianbo22.xboot.base.XbootBaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author WangCH
 */
@Data
//@Entity  //JPA
//@Table(name = "t_teacher")  //JPA
@TableName("t_teacher")
@ApiModel(value = "测试Teacher")
public class Teacher extends XbootBaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "名字")
    private String name;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "所教课程")
    private String course;


}