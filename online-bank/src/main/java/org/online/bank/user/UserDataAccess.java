package org.online.bank.user;

import org.online.bank.user.userServiceImpl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDataAccess {

    private static final Logger logger = LoggerFactory.getLogger(UserDataAccess.class);

    public User createUser(String test, User user) throws Exception{
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.createUser(user);
        return user;
    }
}
