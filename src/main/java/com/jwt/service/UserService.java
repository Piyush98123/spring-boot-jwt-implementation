package com.jwt.service;

import com.jwt.dto.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    static List<User>userDao = new ArrayList<>();
    public UserService(){
        userDao.add(new User("Chintu","11223344"));
        userDao.add(new User("Mintu","55667788"));
        userDao.add(new User("Pintu","2233445"));
        userDao.add(new User("Rahul","66776"));

    }


    public void saveUser(User user){
        userDao.add(user);
    }

    public List<User> getUser(){
        return userDao;
    }



}
