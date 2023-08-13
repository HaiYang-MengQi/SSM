package com.experience.dao;

import com.experience.entity.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

public interface User_login_dao {
        @Results(id = "user" , value = {
            @Result(id = true , column = "id" , property = "id"),
            @Result(column = "username" ,property = "username"),
            @Result(property = "password", column = "password"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "tel", column = "tel"),
            @Result(property = "address", column = "address"),
    })
        User findUser(User user);
}
