package com.tianbo22.xboot.modules.base.dao;

import com.tianbo22.xboot.base.XbootBaseDao;
import com.tianbo22.xboot.modules.base.entity.QuartzJob;

import java.util.List;

/**
 * 定时任务数据处理层
 * @author WangCH
 */
public interface QuartzJobDao extends XbootBaseDao<QuartzJob,String> {

    /**
     * 通过类名获取
     * @param jobClassName
     * @return
     */
    List<QuartzJob> findByJobClassName(String jobClassName);
}