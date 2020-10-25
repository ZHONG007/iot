package com.iot.blog.mapper;

import com.iot.blog.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;

@Mapper
public interface UserMapper {
  @Insert("insert into user (name,token,gmtCreate) values (#{name},#{token},#{gmtCreate})")
  void insert(User user);

}