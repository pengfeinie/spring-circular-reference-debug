package com.niepengfei.spring.circular.reference.test1.meta;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.io.Serializable;
import java.util.List;

/**
 * @author niepengfei
 * @version 1.0.0
 * @since 2019/12/21
 */
@ToString
@Getter
@Setter
public class User implements Serializable {

    private Long userId;

    private String name;

    private String password;

    private List<Role> roleList;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
