package services;

import daos.UserDao;
import models.User;

import java.util.Map;

public class UserService {
    private static Map<String, User> userMap = UserDao.getUserMap();
    public void addUser(String name, Character gender, int age) {
        User user = new User(name, gender, age);
        userMap.put(user.getName(), user);
    }
}
