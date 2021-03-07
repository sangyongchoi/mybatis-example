package user;

public class User {

    private String userId;
    private String userNm;

    public User(String userId, String userNm) {
        this.userId = userId;
        this.userNm = userNm;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userNm='" + userNm + '\'' +
                '}';
    }
}
