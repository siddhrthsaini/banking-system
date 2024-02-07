package org.online.bank.user;

import org.online.bank.common.CommonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    public static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/create")
    public CommonResponse createUser(@RequestHeader("test") String test, @RequestBody User user) throws Exception{

        UserHelper userHelper = new UserHelper();
        CommonResponse commonResponse = new CommonResponse();
        try{
            //fv
            //bv
            user = userHelper.createUser(test, user);
            commonResponse.setResponseObject(user);

        }catch (Exception e) {
            logger.info("Error while creating user ");
        }
        return commonResponse;
    }

}