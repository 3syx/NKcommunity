package com.nowcoder.community.community.dao;

import com.nowcoder.community.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName DiscussPostMapper
 * @Description TODO
 * @Author zx
 * @Date 2022/10/25 10:49
 * @Version 1.0
 */
@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // @Param注解用于给参数取别名
    // 如果只有一个参数，并且在<if>里面使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);

}
