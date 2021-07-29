package cn.itutoia.springboot.springboot_mybatisplus.comon.base;

import cn.itutoia.springboot.springboot_mybatisplus.module.user.pojo.DO.User;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.Map;

/**
 * @description:
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2021/7/29 10:09
 */
public interface BaseService<T>{

    T getById(Integer id);

    int save(T entity);

    IPage<T> selectPage(Map<String,Object> paramsMap);

    int update(T entity);

    int deleteById(Integer id);
}
