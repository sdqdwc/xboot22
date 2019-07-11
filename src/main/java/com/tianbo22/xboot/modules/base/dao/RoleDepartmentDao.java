package com.tianbo22.xboot.modules.base.dao;

import com.tianbo22.xboot.base.XbootBaseDao;
import com.tianbo22.xboot.modules.base.entity.RoleDepartment;

import java.util.List;

/**
 * 角色部门数据处理层
 * @author WangCH
 */
public interface RoleDepartmentDao extends XbootBaseDao<RoleDepartment,String> {

    /**
     * 通过roleId获取
     * @param roleId
     * @return
     */
    List<RoleDepartment> findByRoleId(String roleId);

    /**
     * 通过角色id删除
     * @param roleId
     */
    void deleteByRoleId(String roleId);

    /**
     * 通过角色id删除
     * @param departmentId
     */
    void deleteByDepartmentId(String departmentId);
}