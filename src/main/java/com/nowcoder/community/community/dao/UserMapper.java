package com.nowcoder.community.community.dao;

import com.nowcoder.community.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author zx
 * @Date 2022/10/19 11:29
 * @Version 1.0
 */
//Spring容器装配这个bean
@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insetUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);

}
