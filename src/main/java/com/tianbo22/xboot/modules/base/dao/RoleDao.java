package com.tianbo22.xboot.modules.base.dao;

import com.tianbo22.xboot.base.XbootBaseDao;
import com.tianbo22.xboot.modules.base.entity.Role;

import java.util.List;

/**
 * 角色数据处理层
 * @author WangCH
 */
public interface RoleDao extends XbootBaseDao<Role,String> {

    /**
     * 获取默认角色
     * @param defaultRole
     * @return
     */
    List<Role> findByDefaultRole(Boolean defaultRole);
}
