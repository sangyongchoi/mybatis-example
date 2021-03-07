package user;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseSessionFactoryTest {
    @Test
    @DisplayName("reader null 테스트")
    public void reader_numm_test() throws Exception{
        try(SqlSession session = DatabaseSessionFactory.getSqlSession()){
            System.out.println("11");
        }
    }
}