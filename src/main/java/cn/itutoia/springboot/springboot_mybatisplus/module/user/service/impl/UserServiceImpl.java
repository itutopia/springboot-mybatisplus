package cn.itutoia.springboot.springboot_mybatisplus.module.user.service.impl;

import cn.itutoia.springboot.springboot_mybatisplus.module.user.mapper.UserMapper;
import cn.itutoia.springboot.springboot_mybatisplus.module.user.pojo.DO.User;
import cn.itutoia.springboot.springboot_mybatisplus.module.user.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

/**
 * @description: 用户接口实现类
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2021/7/29 10:06
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int save(User user) {
        user.setCreated(new Date());
        user.setEdited(new Date());
        return userMapper.insert(user);
    }

    @Override
    public User getById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public IPage<User> selectPage(Map<String, Object> params) {
        long pageNum = Long.parseLong((String) params.get("pageNumber"));
        long pageSize = Long.parseLong((String) params.get("pageSize"));
        Page<User> page = new Page<>(pageNum, pageSize);
        String name = (String) params.get("name");
        QueryWrapper<User> wrapper = null;
        if (name != null) {
            wrapper = new QueryWrapper<User>().like("name", name).orderBy(true, false, "created");
        }
        Page devicePageList = userMapper.selectPage(page, wrapper);
        return devicePageList;
    }

    @Override
    public int update(User entity) {
        return userMapper.updateById(entity);
    }

    @Override
    public int deleteById(Integer id) {
        return userMapper.deleteById(id);
    }
}