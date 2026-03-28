package com.example.oracletest.mapper;

import com.example.oracletest.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {

    //查询单个
    User  findById (Long id) ;
    //查询全部
    List<User> findAll();

    //新增
    void insert(User user) ;

    //修改
    void update(User user);

    //删除
    void delete(Long id);

}
