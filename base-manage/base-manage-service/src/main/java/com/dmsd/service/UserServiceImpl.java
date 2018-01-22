package com.dmsd.service;

import com.dmsd.api.UserService;
import com.dmsd.dao.TAllusersMapper;
import com.dmsd.pojo.TAllusers;
import com.dmsd.pojo.TStudent;
import com.dmsd.studentdao.TStudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * Created by Ares on 2017/10/24.
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    @Qualifier("jtaDataSource1")
    private DataSource ds1;

    @Autowired
    @Qualifier("jtaDataSource2")
    private DataSource ds2;

    @Autowired
    TAllusersMapper tAllusersMapper;

    @Autowired
    TStudentMapper tStudentMapper;
/*
    @Autowired
    TStudent tStudent;

    @Autowired
    TAllusers tAllusers;*/



    @Override
    public void addStudent() {
        JdbcTemplate jt1 = new JdbcTemplate(ds1);
        JdbcTemplate jt2 = new JdbcTemplate(ds2);

        List<Map<String, Object>> list = jt1.queryForList("SELECT * FROM  t_student");

        System.out.println(list);

        jt1.execute("INSERT INTO `t_student` ( `name`, `address`) VALUES ( 'AresAAAA', 'beijing')");

        jt2.execute("INSERT INTO `t_allusers` ( `name`, `address`) VALUES ( 'AresBBBB', 'beijing')");

        int a =5/0;
    }

    @Override
    public void addStudent2() {
        TAllusers tAllusers1 = tAllusersMapper.selectByPrimaryKey(1);
        System.out.println(tAllusers1);

        TStudent tStudent = new TStudent();
        tStudent.setAddress("langfang");
        tStudent.setName("AresCCCC");
        tStudentMapper.insert(tStudent);

        TAllusers tAllusers2 =new TAllusers();
        tAllusers2.setAddress("shagnhai");
        tAllusers2.setName("AresDDDD");
        tAllusersMapper.insert(tAllusers2);

//       int a =1/0;

    }


}
