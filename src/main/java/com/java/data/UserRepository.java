package com.java.data;

import java.util.HashMap;
import java.util.Map;

import com.java.Models.User;
import com.java.Models.User.UserType;

public class UserRepository {

    private Map<String , User> users = new HashMap<String, User>();

    public UserRepository(){
        users.put("matt",new User("matt", "letmein",false, UserType.REGULAR_USER ));
        users.put("frank",new User("frank", "myPassword", false, UserType.ADMIN_USER));
    }

    public User findByUsername(String username) {
       return users.get(username);
    }

}
