package com.example.demo;

import com.example.demo.dto.createUserDTO;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserTest {

    @Autowired
    UserService userService;

    @Test
    void createUser() {
        String firstName = "toto";
        String lastName = "titi";
        createUserDTO dto = new createUserDTO();
        dto.setFirstName(firstName);
        dto.setLastName(lastName);
        UserEntity user = userService.createUser(dto);
        assertThat(user.firstName).isEqualTo(dto.firstName);
        assertThat(user.lastName).isEqualTo(dto.lastName);
    }
}
