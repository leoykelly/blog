package com.rivera;


import org.hibernate.annotations.Entity;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Table;

import javax.persistence.*;

/**
 * Created by Kelly on 2/12/2017.
 */
@Entity
@Table(name="user")
public class User {



    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_email")
    private String userEmailAddress;



    public User() {

    }


    public User(String userName, String userPassword, String userEmailAddress) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmailAddress = userEmailAddress;
    }

    public int getUserId() {

        return userId;
    }

    public String getUserPassword() {

        return userPassword;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserPassword(String userPassword) {

        this.userPassword = userPassword;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public String getUserEmailAddress() {

        return userEmailAddress;
    }

    public void setUserEmailAddress(String userEmailAddress) {

        this.userEmailAddress = userEmailAddress;
    }
}
