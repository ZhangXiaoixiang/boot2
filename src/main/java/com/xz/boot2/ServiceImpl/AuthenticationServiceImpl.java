package com.xz.boot2.ServiceImpl;

import com.xz.boot2.entity.Authentication;
import com.xz.boot2.repository.AuthenticationRep;
import com.xz.boot2.service.AuthenticationService;
import com.xz.boot2.utils.JsonResult;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = Logger.getLogger(AuthenticationServiceImpl.class);
    @Autowired
    private AuthenticationRep rep;
    @Autowired
    private AuthenticationService authenticationService;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 发送验证码并保存到数据库(non-Javadoc)
     *
     * @param authentication
     * @return
     */
    @Override
    public JsonResult<Authentication> sendVerification(Authentication authentication) {


        return null;

    }

    @Override
    public Authentication getById(Integer id) {
        Authentication authentication = rep.findById(id).get();

        System.out.println(authentication);
        return authentication;
    }


}
