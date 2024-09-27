package com.uninorte.mocktest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.uninorte.integrationtesting.User;
import com.uninorte.integrationtesting.UserRepository;
import com.uninorte.integrationtesting.UserService;

public class MockTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    public void testUserCreationAndRetrieval() {
        User user = new User("John Doe", "john.doe@example.com");

        // Define behavior for the mock object
        when(userRepository.findUserByEmail("john.doe@example.com")).thenReturn(user);

        // Test the creation and retrieval
        userService.createUser(user);
        verify(userRepository).saveUser(user); // Verify that saveUser was called

        User retrievedUser = userService.getUserByEmail("john.doe@example.com");
        assertNotNull(retrievedUser);
        assertEquals("John Doe", retrievedUser.getName());
    }
}