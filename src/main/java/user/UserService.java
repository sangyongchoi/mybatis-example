package user;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserService {
    public void insertUser(){
        try(SqlSession session = DatabaseSessionFactory.getSqlSession()){
            User user = new User("test1", "test");
            session.insert("test.insertTest", user);
            session.commit();
        }
    }

    public List<User> selectUser(){
        try(SqlSession session = DatabaseSessionFactory.getSqlSession()){
            return session.selectList("test.selectTest");
        }
    }
}
