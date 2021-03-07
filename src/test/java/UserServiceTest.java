import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import user.User;
import user.UserService;

import java.util.List;

class UserServiceTest {

    @Test
    @DisplayName("Insert 테스트")
    public void insert_test() throws Exception{
        UserService userService = new UserService();
        userService.insertUser();
    }

    @Test
    @DisplayName("Select Test")
    public void select_test() throws Exception{
        UserService userService = new UserService();
        final List<User> users = userService.selectUser();
        users.forEach(System.out::println);
    }
}