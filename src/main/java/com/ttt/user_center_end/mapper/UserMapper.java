package com.ttt.user_center_end.mapper;

import com.ttt.user_center_end.model.domian.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
* @author Jasont
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2022-11-07 16:29:57
* @Entity com.ttt.user_center_end.model.domian.User
*/

public interface UserMapper extends BaseMapper<User> {

}




