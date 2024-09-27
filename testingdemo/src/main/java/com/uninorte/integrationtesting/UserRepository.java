package com.uninorte.integrationtesting;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private Map<String, User> database = new HashMap<>();

    public void saveUser(User user) {
        database.put(user.getEmail(), user);
    }

    public User findUserByEmail(String email) {
        return database.get(email);
    }
}
