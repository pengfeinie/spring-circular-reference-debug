package com.niepengfei.spring.circular.reference.test1.service.impl;

import com.niepengfei.spring.circular.reference.test1.meta.Role;
import com.niepengfei.spring.circular.reference.test1.service.RoleService;
import com.niepengfei.spring.circular.reference.test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author niepengfei
 * @version 1.0.0
 * @since 2019/12/21
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private UserService userService;

    @Override
    public List<Role> getRoleListByUserId(Long userId) {
        boolean hasUser = userService.hasUser(userId);
        if (hasUser){
            Role role = new Role();
            return Arrays.asList(role);
        }
        return Collections.emptyList();
    }
}
