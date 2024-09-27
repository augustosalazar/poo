package com.uninorte.integrationtesting;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(User user) {
        userRepository.saveUser(user);
    }

    public User getUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }
}
