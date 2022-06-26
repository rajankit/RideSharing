package daos;

import models.User;
import java.util.*;

public class UserDao {
    private static Map<String, User> userMap = new HashMap<>();

    private UserDao() {}

    public static Map<String, User> getUserMap() {
        return userMap;
    }
}
