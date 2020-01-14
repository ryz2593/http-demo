package com.leyou.demo.httpdemo.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ryz2593
 * @date 2020/1/13 15:47
 * <p>
 * 
 */
@Data
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
}
