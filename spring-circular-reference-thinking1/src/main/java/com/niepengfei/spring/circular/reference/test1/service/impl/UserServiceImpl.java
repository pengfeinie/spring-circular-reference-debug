package com.niepengfei.spring.circular.reference.test1.service.impl;

import com.niepengfei.spring.circular.reference.test1.meta.User;
import com.niepengfei.spring.circular.reference.test1.service.RoleService;
import com.niepengfei.spring.circular.reference.test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author niepengfei
 * @version 1.0.0
 * @since 2019/12/21
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private RoleService roleService;

    @Override
    public User getUserByUserId(Long userId) {
        User user = new User();
        user.setUserId(userId);
        user.setName("Jack");
        user.setPassword("123456");
        user.setRoleList(roleService.getRoleListByUserId(userId));
        return user;
    }

    public boolean hasUser(Long userId) {
        return true;
    }
}
