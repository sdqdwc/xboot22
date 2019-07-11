package com.tianbo22.xboot.modules.base.service;


import com.tianbo22.xboot.base.XbootBaseService;
import com.tianbo22.xboot.modules.base.entity.Role;

import java.util.List;

/**
 * 角色接口
 * @author WangCH
 */
public interface RoleService extends XbootBaseService<Role,String> {

    /**
     * 获取默认角色
     * @param defaultRole
     * @return
     */
    List<Role> findByDefaultRole(Boolean defaultRole);
}
