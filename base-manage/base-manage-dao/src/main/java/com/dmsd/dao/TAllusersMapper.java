package com.dmsd.dao;

import com.dmsd.pojo.TAllusers;
import com.dmsd.pojo.TAllusersExample;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

public interface TAllusersMapper {
    int countByExample(TAllusersExample example);

    int deleteByExample(TAllusersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAllusers record);

    int insertSelective(TAllusers record);

    List<TAllusers> selectByExample(TAllusersExample example);

    TAllusers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAllusers record, @Param("example") TAllusersExample example);

    int updateByExample(@Param("record") TAllusers record, @Param("example") TAllusersExample example);

    int updateByPrimaryKeySelective(TAllusers record);

    int updateByPrimaryKey(TAllusers record);
}