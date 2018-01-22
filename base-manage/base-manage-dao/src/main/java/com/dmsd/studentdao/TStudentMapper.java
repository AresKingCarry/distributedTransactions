package com.dmsd.studentdao;

import com.dmsd.pojo.TStudent;
import com.dmsd.pojo.TStudentExample;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

public interface TStudentMapper {
    int countByExample(TStudentExample example);

    int deleteByExample(TStudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TStudent record);

    int insertSelective(TStudent record);

    List<TStudent> selectByExample(TStudentExample example);

    TStudent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TStudent record, @Param("example") TStudentExample example);

    int updateByExample(@Param("record") TStudent record, @Param("example") TStudentExample example);

    int updateByPrimaryKeySelective(TStudent record);

    int updateByPrimaryKey(TStudent record);
}