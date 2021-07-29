package cn.itutoia.springboot.springboot_mybatisplus.comon.base;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2021/7/29 10:01
 */
@Data
public abstract class BaseEntity implements Serializable {

    private Integer creator;
    private Date created;
    private Integer editor;
    private Date edited;
}
