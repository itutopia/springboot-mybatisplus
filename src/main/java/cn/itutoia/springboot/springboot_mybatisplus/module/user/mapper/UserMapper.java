package cn.itutoia.springboot.springboot_mybatisplus.module.user.mapper;

import cn.itutoia.springboot.springboot_mybatisplus.module.user.pojo.DO.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: 用户持久化映射接口
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2021/7/29 10:07
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
