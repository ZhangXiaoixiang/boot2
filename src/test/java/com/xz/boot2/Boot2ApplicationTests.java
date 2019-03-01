package com.xz.boot2;

import com.xz.boot2.entity.Authentication;
import com.xz.boot2.repository.AuthenticationRep;
import com.xz.boot2.service.AuthenticationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Boot2ApplicationTests {
    @Autowired
    private AuthenticationService authenticationService;
    @Autowired
    private AuthenticationRep rep;

    @Test
    public void contextLoads() {
    }

    /**
     * 测试jpa
     */
    @Test
    public void sms() {
        Authentication authentication = authenticationService.getById(36);
        System.out.println(authentication);
    }

    /**
     * 测试jpa
     */
    @Test
    public void sms2() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Authentication rep = this.rep.findByPhoneAndUdate("18883173479",sdf.format(new Date()));
        if (null!=rep){
            System.out.println(rep);
        }else {
            System.out.println("数据库没有");
        }

    }

}
