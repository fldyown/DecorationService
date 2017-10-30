package com.decoration.service.service;


import com.decoration.service.model.UserVo;

import java.util.List;

public interface IUserService {

    /**
     * 保存用户数据
     *
     * @param username
     * @param password
     * @param phone
     * @param email
     * @return
     */
    Long save(String username, String password, String phone, String email);

    /**
     * 保存用户数据
     *
     * @param userVo 用户数据
     * @return 主键
     */
    Long save(UserVo userVo);

    /**
     * 通过uid查找对象
     *
     * @param uid
     * @return
     */
    UserVo findById(Long uid);

    /**
     * 分页查询
     *
     * @param page
     * @param size
     * @return
     */
    List<UserVo> findAll(int page, int size);
}
