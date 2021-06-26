package com.test01.ch01.config.auth.dto;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import com.test01.ch01.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
