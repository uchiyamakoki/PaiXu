package cn.string.day16.cn.sn.test;

import cn.string.day16.cn.sn.dao.UserDao;
import cn.string.day16.cn.sn.game.GameNumber;
import cn.string.day16.cn.sn.impl.UserDaoImpl;
import cn.string.day16.cn.sn.pojo.User;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        while (true) {


            System.out.println("---------------欢迎光临--------------");
            System.out.println("1.登陆");
            System.out.println("2.注册");
            System.out.println("3.退出");
            System.out.println("请输入你的选择:");

            Scanner sc = new Scanner(System.in);
            String choiceString = sc.nextLine();
            UserDao ud = new UserDaoImpl();
            switch (choiceString) {
                case "1":
                    System.out.println("----------------登陆界面-----------");
                    System.out.println("请输入用户名：");
                    String username = sc.nextLine();
                    System.out.println("请输入密码：");
                    String password = sc.nextLine();

                    boolean flag = ud.isLogin(username, password);
                    if (flag) {
                        System.out.println("登陆成功");
                        System.out.println("你玩吗？Y/N");
                        while (true){
                            String resultString=sc.nextLine();
                            if (resultString.equalsIgnoreCase("y")){
                                GameNumber.start();
                                System.out.println("你还玩吗？Y/N");
                            }else {
                                break;
                            }
                        }

                      System.out.println("谢谢使用，欢迎下次再来");
                        System.exit(0);
                    } else {
                        System.out.println("登陆失败用户名或者密码错误");
                    }

                    break;
                case "2":
                    System.out.println("----------------注册界面-----------");
                    System.out.println("请输入用户名：");
                    String newUsername = sc.nextLine();
                    System.out.println("请输入密码：");
                    String newPassword = sc.nextLine();

                    User user = new User();
                    user.setUsername(newUsername);
                    user.setPassword(newPassword);


                    ud.regist(user);
                    System.out.println("注册成功");

                    break;
                case "3":
                    break;
                default:
                    System.out.println("谢谢使用，欢迎下次再来");
                    System.exit(0);
                    break;
            }
        }
    }
}
