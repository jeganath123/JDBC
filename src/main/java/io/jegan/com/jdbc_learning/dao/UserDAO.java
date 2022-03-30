package io.jegan.com.jdbc_learning.dao;

import io.jegan.com.jdbc_learning.User;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.sql.*;

@Service
public class UserDAO {
    Connection connection;
//    jdbc:mysql:// server-name : server-port / database-name Note – NOTE: Default server port is 3306

    @PostConstruct
    public void init(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pragra",
                    "appuser","appuser");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public void addUser(User user) throws SQLException {
        String sql="INSERT INTO user_detail values (" +user.getId()+"',"+user.getFirstName()+",'"+user.getLastName()+"')";
        Statement statement = connection.createStatement();
        statement.execute(sql);

    }
    public void printdetails() throws SQLException {
        String sql="SELECT * FROM user_detail";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.getResultSet();
        while (resultSet.next()){
            System.out.println("Id : %d , Firstname : %s, Lastname : %s"+resultSet.getInt("id")+" ,"+
                    resultSet.getString("first_name")+
                    " ,"+resultSet.getString("last_name"));
        }


    }

}
