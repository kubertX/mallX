package com.kubertX.mallX.admin.mapper;

import com.kubertX.mallX.admin.model.UmsAdminLoginLog;

public interface UmsAdminLoginLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UmsAdminLoginLog row);

    int insertSelective(UmsAdminLoginLog row);

    UmsAdminLoginLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UmsAdminLoginLog row);

    int updateByPrimaryKey(UmsAdminLoginLog row);
}