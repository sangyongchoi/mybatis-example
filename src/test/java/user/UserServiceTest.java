package user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class UserServiceTest {

    @Test
    @DisplayName("Insert 테스트")
    public void insert_test() {
        UserService userService = new UserService();
        userService.insertUser();
    }

    @Test
    @DisplayName("Select Test")
    public void select_test() {
        UserService userService = new UserService();
        final List<User> users = userService.selectUser();
        users.forEach(System.out::println);
    }
}