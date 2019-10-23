package com.my.over.service.user;

import com.my.over.repository.user.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserEntityRepository userEntityRepository;

}
