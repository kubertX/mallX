package com.kubertX.mallX.admin.mapper;

import com.kubertX.mallX.admin.model.UmsMenu;

public interface UmsMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMenu row);

    int insertSelective(UmsMenu row);

    UmsMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMenu row);

    int updateByPrimaryKey(UmsMenu row);
}