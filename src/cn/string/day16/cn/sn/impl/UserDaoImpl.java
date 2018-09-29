package cn.string.day16.cn.sn.impl;

import cn.string.day16.cn.sn.dao.UserDao;
import cn.string.day16.cn.sn.pojo.User;

import java.util.ArrayList;

public class UserDaoImpl implements UserDao{
    private static ArrayList<User> array=new ArrayList<User>();

    @Override
    public boolean isLogin(String username, String password) {
        boolean flag=false;
        for (User u:array){
            if (u.getUsername().equals(username)
                    &&u.getPassword().equals(password)){
                flag=true;
                break;
            }
        }
        return flag;
    }

    @Override
    public void regist(User user) {
        //ArrayList<User> array=new ArrayList<User>();
        array.add(user);
    }
}
