package org.online.bank.user;

import java.util.UUID;

public class UserHelper {

    public User createUser(String test, User user) throws  Exception {
        UserDataAccess userDataAccess = new UserDataAccess();
        String crestedById = UUID.randomUUID().toString();
        user.setCreatedBy(crestedById);
        user = userDataAccess.createUser(test, user);
        return user;
    }
}
