package org.online.bank.user;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/user")
public class UserDataAccess {

    private static final Logger logger = LoggerFactory.getLogger(UserDataAccess.class);

    @Autowired
    UserRepo userRepo;

    public User createUser(String test, User user) throws Exception{
        userRepo.save(user);
        return user;
    }
}
