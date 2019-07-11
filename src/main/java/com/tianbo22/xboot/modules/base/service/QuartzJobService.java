package com.tianbo22.xboot.modules.base.service;

import com.tianbo22.xboot.base.XbootBaseService;
import com.tianbo22.xboot.modules.base.entity.QuartzJob;

import java.util.List;

/**
 * 定时任务接口
 * @author WangCH
 */
public interface QuartzJobService extends XbootBaseService<QuartzJob,String> {

    /**
     * 通过类名获取
     * @param jobClassName
     * @return
     */
    List<QuartzJob> findByJobClassName(String jobClassName);
}