package user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class UserMapperTest {
    @Test
    @DisplayName("Annotation 기반 Select 테스트")
    public void annotation_select_test(){
        UserService userService = new UserService();
        final List<User> users = userService.selectUserWhenUseSelectAnnotation();
        users.forEach(System.out::println);
    }
}