package hello.entity;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by miaorf on 2016/8/2.
 */
public class User {
    @NotNull(message = "用户名不能为空")
    @Length(min=5, max=20, message="用户名长度必须在5-20之间")
    @Pattern(regexp = "^[a-zA-Z_]\\w{4,19}$", message = "用户名必须以字母下划线开头，可由字母数字下划线组成")
    private String name;
    @NotNull(message = "age不能为空")
    private int age;
    @NotNull(message = "sex不能为空")
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
