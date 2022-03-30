package io.jegan.com.jdbc_learning;

import io.jegan.com.jdbc_learning.dao.UserDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
public class JdbcLearningApplication {

    public static void main(String[] args) throws SQLException {

        ConfigurableApplicationContext context = SpringApplication.run(JdbcLearningApplication.class, args);
        UserDAO dao = context.getBean(UserDAO.class);
//        dao.addUser(new User(1,"Jeganath","Rengasamy"));
        dao.printdetails();

    }

}
