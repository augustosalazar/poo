package com.uninorte.integrationtest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.uninorte.integrationtesting.User;
import com.uninorte.integrationtesting.UserRepository;
import com.uninorte.integrationtesting.UserService;


public class IntegrationTest {
    private  UserService userService;
    private  UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        userRepository = new UserRepository(); // Assuming this connects to a real database
        userService = new UserService(userRepository);
    }

    @Test
    public void testUserCreationAndRetrieval() {
        User user = new User("John Doe", "john.doe@example.com");
        userService.createUser(user);

        User retrievedUser = userService.getUserByEmail("john.doe@example.com");
        assertNotNull(retrievedUser);
        assertEquals("John Doe", retrievedUser.getName());
    }
}
