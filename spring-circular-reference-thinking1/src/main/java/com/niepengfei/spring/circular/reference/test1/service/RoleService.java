package com.niepengfei.spring.circular.reference.test1.service;

import com.niepengfei.spring.circular.reference.test1.meta.Role;

import java.util.List;

/**
 * @author niepengfei
 * @version 1.0.0
 * @since 2019/12/21
 */
public interface RoleService {

    List<Role> getRoleListByUserId(Long userId);
}
