package org.online.bank.user.userServiceImpl;

import org.online.bank.common.DBUtil;
import org.online.bank.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class UserServiceImpl {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    Connection connection;
    public UserServiceImpl() throws SQLException {
        connection = DBUtil.getConnection();
    }

    public void createUser(User user) {
        String query = "INSERT INTO users (id, name, email) VALUES('"+user.getId()+"','"+user.getName()+"','"+user.getEmailId()+"')";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.executeUpdate();
            logger.info("----------------------Data Added--------------------------");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
