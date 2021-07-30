package cn.itutoia.springboot.springboot_mybatisplus.module.user.pojo.DTO;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @description: 用户传输对象
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2021/7/29 10:05
 */
@Data
public class UserDTO {

    private Integer id;
    @NotNull
    @Size(max=32,message="名称长度不能超过{max}位")
    private String name;
    private Date birthday;
}
