package io.jegan.com.jdbc_learning;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.config.Scope;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String firstName;
    private String lastName;
}
