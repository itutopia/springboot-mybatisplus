package cn.itutoia.springboot.springboot_mybatisplus.module.user.pojo.DTO;

import lombok.Data;

import java.util.Date;

/**
 * @description: 用户接受类
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2021/7/29 10:05
 */
@Data
public class UserDTO {

    private Integer id;
    private String name;
    private Date birthday;
}
