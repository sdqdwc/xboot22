package com.tianbo22.xboot.modules.base.dao;

import com.tianbo22.xboot.base.XbootBaseDao;
import com.tianbo22.xboot.modules.base.entity.DictData;

import java.util.List;

/**
 * 字典数据数据处理层
 * @author WangCH
 */
public interface DictDataDao extends XbootBaseDao<DictData,String> {


    /**
     * 通过dictId和状态获取
     * @param dictId
     * @param status
     * @return
     */
    List<DictData> findByDictIdAndStatusOrderBySortOrder(String dictId, Integer status);

    /**
     * 通过dictId删除
     * @param dictId
     */
    void deleteByDictId(String dictId);
}