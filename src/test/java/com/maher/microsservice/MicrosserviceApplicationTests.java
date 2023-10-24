package com.maher.microsservice;

import com.maher.microsservice.entities.Role;
import com.maher.microsservice.entities.User;
import com.maher.microsservice.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MicrosserviceApplicationTests {
    @Autowired
    UserService userService;

    @Test
    void testRegisterUserAndSendVerificationCode() {
        User user = new User(null, "ahmedmayara", "ahmedmayara789@gmail.com", "123456", null, false, null);
        userService.saveUser(user);
    }

    @Test
    void activatedUserAccount() {
        User user = userService.activateUser("ahmedmayara", "4868");
        System.out.println(user);
    }

    @Test
    void testDeleteUser() {
        userService.deleteUser(3);
    }
}
