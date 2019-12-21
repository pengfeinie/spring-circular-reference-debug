package com.niepengfei.spring.circular.reference.test1;

import com.niepengfei.spring.circular.reference.test1.config.AppConfig;
import com.niepengfei.spring.circular.reference.test1.meta.User;
import com.niepengfei.spring.circular.reference.test1.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author niepengfei
 * @version 1.0.0
 * @since 2019/12/21
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = ac.getBean(UserService.class);
        User user = userService.getUserByUserId(1L);
        System.out.println(user);
    }
}
