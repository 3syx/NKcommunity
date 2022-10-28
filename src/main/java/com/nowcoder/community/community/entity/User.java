package com.nowcoder.community.community.entity;

import lombok.Data;

/**
 * @ClassName User
 * @Description TODO
 * @Author zx
 * @Date 2022/10/13 12:08
 * @Version 1.0
 */
@Data
public class User {

    private int id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private int type;
    private int status;
    private String activationCode;
    private String headerUrl;
    private String createTime;

}
