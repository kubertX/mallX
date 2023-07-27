package com.kubertX.mallX.admin.mapper;

import com.kubertX.mallX.admin.model.UmsAdmin;

public interface UmsAdminMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdmin row);

    int insertSelective(UmsAdmin row);

    UmsAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdmin row);

    int updateByPrimaryKey(UmsAdmin row);
}