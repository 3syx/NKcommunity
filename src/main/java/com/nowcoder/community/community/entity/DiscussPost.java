package com.nowcoder.community.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName DiscussPost
 * @Description TODO
 * @Author zx
 * @Date 2022/10/25 10:43
 * @Version 1.0
 */
@Data
public class DiscussPost {

    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;
    private int status;
    private Date createTime;
    private int commentCunt;
    private double score;

}
