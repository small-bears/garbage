package com.project.demo.dao.base;


import java.util.List;
import java.util.Map;

public interface BaseMapper<E> extends com.baomidou.mybatisplus.core.mapper.BaseMapper<E> {

    List<Map<String,Object>> selectBaseList(String select);

    Integer selectBaseCount(String count);

    Object selectBaseOne(String select);

    int updateBaseSql(String sql);

    int deleteBaseSql(String sql);
}
