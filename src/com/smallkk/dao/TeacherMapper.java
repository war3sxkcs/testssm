package com.smallkk.dao;

import com.smallkk.entity.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer tid);

    Teacher selectByPrimaryKeyWithStudent(Integer tid);

    //    @Param 是Mybatis里面的注解;是因为复杂类型不好区分;加上这个注解只是便于系统识别 这个名字要与xml里面的名字一致
    List<Teacher> selectByTids(@Param("tids") List<Integer> tids);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);


}