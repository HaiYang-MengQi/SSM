package com.experience.dao;

import com.experience.entity.User;

import java.util.List;

/**
 * @author 汪海洋
 */
public interface User_orders_dao {
//FIXME 它遇到了很奇怪的bug,在它的xml文件内的配置
//FIXME 就是在它的数据库列与pojo类进行对应配置的时候
//FIXME 数据库列加上不同的表名会出现不同的效果
//FIXME 订单表显示错误,id列显示为0
    List<User> getOrders(int id);
}
