package com.decoration.service.controller;

import com.decoration.service.model.UserVo;
import com.decoration.service.service.IUserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @ApiOperation("添加用户")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "String", paramType = "query"),
                    @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "query"),
                    @ApiImplicitParam(name = "phone", value = "手机号", required = false, dataType = "String", paramType = "query"),
                    @ApiImplicitParam(name = "email", value = "邮箱", required = false, dataType = "String", paramType = "query")
            }
    )
    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Long save(@RequestParam String username, @RequestParam String password, @RequestParam String phone, @RequestParam String email) {
        return userService.save(username, password, phone, email);
    }

    @ApiOperation("分页查询用户")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "page", value = "页码", required = true, dataType = "Integer", paramType = "query"),
                    @ApiImplicitParam(name = "size", value = "数据量", required = true, dataType = "Integer", paramType = "query")
            }
    )
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserVo> list(@RequestParam int page, @RequestParam int size) {
        return userService.findAll(page, size);
    }
}
