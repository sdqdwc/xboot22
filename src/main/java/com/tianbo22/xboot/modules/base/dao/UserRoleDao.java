package com.tianbo22.xboot.modules.base.dao;

import com.tianbo22.xboot.base.XbootBaseDao;
import com.tianbo22.xboot.modules.base.entity.UserRole;

import java.util.List;

/**
 * 用户角色数据处理层
 * @author WangCH
 */
public interface UserRoleDao extends XbootBaseDao<UserRole,String> {

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
