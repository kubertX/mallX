package com.kubertX.mallX.admin.mapper;

import com.kubertX.mallX.admin.model.UmsResourceCategory;

public interface UmsResourceCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsResourceCategory row);

    int insertSelective(UmsResourceCategory row);

    UmsResourceCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsResourceCategory row);

    int updateByPrimaryKey(UmsResourceCategory row);
}