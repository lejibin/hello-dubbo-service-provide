package com.binhow.hello.dubbo.service.provide.api.impl;

import com.binhow.entity.User;
import com.binhow.service.api.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import java.util.Date;

@DubboService(version = "${user.service.version}")
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(int i) {
        return new User(i, "Richard", true, "passwd123", new Date(), "13012345678", "richard@herile.com", "http://baidu.com", new Date());
    }

    @Override
    public User getUserByName(String s) {
        return new User(1, s, true, "passwd123", new Date(), "13012345678", "richard@herile.com", "http://baidu.com", new Date());
    }
}
