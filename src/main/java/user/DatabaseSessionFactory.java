package user;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class DatabaseSessionFactory {
    private static SqlSessionFactory sqlMapper = null;

    static {
        try {
            String resource = "config/myBatisConfig.xml";
            Reader reader = Resources.getResourceAsReader(resource);
            sqlMapper = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession() {
        return sqlMapper.openSession();
    }
}
