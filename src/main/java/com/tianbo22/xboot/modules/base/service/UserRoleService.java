package com.tianbo22.xboot.modules.base.service;


import com.tianbo22.xboot.base.XbootBaseService;
import com.tianbo22.xboot.modules.base.entity.UserRole;

import java.util.List;

/**
 * 用户角色接口
 * @author WangCH
 */
public interface UserRoleService extends XbootBaseService<UserRole,String> {

    /**
     * 通过roleId查找
     * @param roleId
     * @return
     */
    List<UserRole> findByRoleId(String roleId);

    /**
     * 删除用户角色
     * @param userId
     */
    void deleteByUserId(String userId);
}
