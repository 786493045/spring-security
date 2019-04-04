package com.galen.security.mapper;

import com.galen.security.model.SysPermissionRole;

public interface SysPermissionRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysPermissionRole record);

    int insertSelective(SysPermissionRole record);

    SysPermissionRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysPermissionRole record);

    int updateByPrimaryKey(SysPermissionRole record);
}