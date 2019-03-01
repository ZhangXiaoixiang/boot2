package com.xz.boot2.service;

import com.xz.boot2.entity.Authentication;
import com.xz.boot2.utils.JsonResult;

public interface AuthenticationService {
    /**
     * 发送验证码并保存到数据库
     */
    JsonResult<Authentication> sendVerification(Authentication authentication);

    Authentication getById(Integer id);


}
