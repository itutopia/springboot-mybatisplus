package cn.itutoia.springboot.springboot_mybatisplus.module.user.pojo.DO;

import cn.itutoia.springboot.springboot_mybatisplus.comon.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @description:  用户持久化对象
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2021/7/29 10:00
 */
@Data
@TableName("user")
public class User extends BaseEntity {

    private Integer id;
    private String name;
    private Date birthday;

}
