package cn.itutoia.springboot.springboot_mybatisplus.module.user.controller;

import cn.itutoia.springboot.springboot_mybatisplus.comon.api.Result;
import cn.itutoia.springboot.springboot_mybatisplus.comon.exception.BizException;
import cn.itutoia.springboot.springboot_mybatisplus.module.user.pojo.DO.User;
import cn.itutoia.springboot.springboot_mybatisplus.module.user.pojo.DTO.UserDTO;
import cn.itutoia.springboot.springboot_mybatisplus.module.user.service.UserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @description: 用户Controller
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2021/7/29 10:03
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Result<User> addUser(@RequestBody UserDTO userDTO) throws BizException {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        userService.save(user);
        return Result.success();
    }

    @GetMapping(value = "/{id}")
    public Result<User> getUserById(@PathVariable Integer id) {
        User user = userService.getById(id);
        return Result.success(user);
    }

    @GetMapping
    private Result listUserByParams(@RequestParam Map<String, Object> params) {
        IPage<User> UserIPage = userService.selectPage(params);
        return Result.success(UserIPage);
    }

    @PutMapping
    public Result updateUser(@RequestBody @Validated UserDTO UserDTO) {
        User User = new User();
        BeanUtils.copyProperties(UserDTO,User);
        userService.update(User);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    private Result deleteUser(@PathVariable Integer id) throws BizException {
        userService.deleteById(id);
        return Result.success();
    }
    

}
