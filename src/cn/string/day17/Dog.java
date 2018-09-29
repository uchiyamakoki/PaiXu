package cn.string.day17;

public class Dog {
    private int age;
    private String name;
    private String color;
    private char sex;

    public Dog() {
    }

    public Dog(int age, String name, String color, char sex) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
