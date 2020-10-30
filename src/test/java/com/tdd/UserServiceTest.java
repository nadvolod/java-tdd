package com.tdd;

import com.sut.SecurityService;
import com.sut.User;
import com.sut.UserDAO;
import com.sut.UserServiceImpl;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

// https://github.com/tomekkaczanowski/junit-put-exercises
public class UserServiceTest {

    @Test
    public void getPassword() {
        UserDAO dao = mock(UserDAO.class);
        SecurityService service = mock(SecurityService.class);
        User user = mock(User.class);

        UserServiceImpl userService = new UserServiceImpl(dao, service);
        userService.assignPassword(user);

        verify(user.getPassword());
    }
}
