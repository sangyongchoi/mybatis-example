package user;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select user_id, user_nm from user_info")
    List<User> selectUser();
}
