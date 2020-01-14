package com.leyou.demo.httpdemo.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ryz2593
 * @date 2020/1/13 15:47
 * <p>
 *
 */
public class User implements Serializable {

    private static final long serialVersionId = 1L;
    private Long id;

    private String userName;

    private String password;

    private String name;

    private Integer age;

    private Integer sex;

    private String note;

    private Date birthday;

    private Date creteTime;

    private Date updateTime;

    /**
     * //如果字段不需要持久化到数据库使用Transient注解修饰
     * //表示该字段是瞬时的
     */
    private String extra;

    public static long getSerialVersionId() {
        return serialVersionId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreteTime() {
        return creteTime;
    }

    public void setCreteTime(Date creteTime) {
        this.creteTime = creteTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", note='" + note + '\'' +
                ", birthday=" + birthday +
                ", creteTime=" + creteTime +
                ", updateTime=" + updateTime +
                ", extra='" + extra + '\'' +
                '}';
    }
}
