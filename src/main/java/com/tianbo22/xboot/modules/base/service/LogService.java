package com.tianbo22.xboot.modules.base.service;


import com.tianbo22.xboot.base.XbootBaseService;
import com.tianbo22.xboot.common.vo.SearchVo;
import com.tianbo22.xboot.modules.base.entity.Log;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * 日志接口
 * @author WangCH
 */
public interface LogService extends XbootBaseService<Log,String> {

    /**
     * 分页搜索获取日志
     * @param type
     * @param key
     * @param searchVo
     * @param pageable
     * @return
     */
    Page<Log> findByConfition(Integer type, String key, SearchVo searchVo, Pageable pageable);
    /**
     * 删除所有
     */
    void deleteAll();
}
