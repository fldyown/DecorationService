package com.decoration.service.decorationservice;

import com.decoration.service.decorationservice.modal.Vo.UserVo;
import com.decoration.service.decorationservice.utils.TaleUtils;

public class Pwdtest {
    public static void main(String args[]) {
        UserVo user = new UserVo();
        user.setUsername("admin");
        user.setPassword("J9lew2irojE23");
        String encodePwd = TaleUtils.MD5encode(user.getUsername() + user.getPassword());
        System.out.println(encodePwd);
    }
}
