package cn.string.day16.cn.sn.dao;

import cn.string.day16.cn.sn.pojo.User;

public interface UserDao {


    public abstract boolean isLogin(String username,String password);

    public abstract void regist(User user);
}
