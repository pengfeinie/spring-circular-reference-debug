package com.niepengfei.spring.circular.reference.test1.service;

import com.niepengfei.spring.circular.reference.test1.meta.User;

/**
 * @author niepengfei
 * @version 1.0.0
 * @since  2019/12/21
 */
public interface UserService {

    boolean hasUser(Long userId);

    User getUserByUserId(Long userId);

}
