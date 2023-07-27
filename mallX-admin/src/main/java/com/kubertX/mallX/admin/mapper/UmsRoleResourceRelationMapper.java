package com.kubertX.mallX.admin.mapper;

import com.kubertX.mallX.admin.model.UmsRoleResourceRelation;

public interface UmsRoleResourceRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsRoleResourceRelation row);

    int insertSelective(UmsRoleResourceRelation row);

    UmsRoleResourceRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsRoleResourceRelation row);

    int updateByPrimaryKey(UmsRoleResourceRelation row);
}