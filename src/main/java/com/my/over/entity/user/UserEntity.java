package com.my.over.entity.user;

import com.my.over.model.user.User;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("USER")

public class UserEntity extends User implements Serializable {
    private final static long serialVersionUID = 1L;
}
