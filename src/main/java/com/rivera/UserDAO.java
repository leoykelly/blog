package com.rivera;


import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by Kelly on 2/12/2017.
 */
public class UserDAO {

    private final Logger log = Logger.getLogger(this.getClass());


    public int addUser(User user) {
        SessionFactory session = SessionFactoryProvider.getSessionFactory();
        Transaction transaction = session.beginTransaction();
        int user_id = (int)session.save(user_id);
        transaction.commit();
        return user_id;
    }

    public User getUser(int userId) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        try {
            User user = (User) session.get(User.class, userId);
        } catch (Exception exception) {
            log.error("Hibrenate Exception");
        }
        return user;
    }

    public void updateUser() {

    }

    public void removeUser(int userId) {

    }

    public String getUserByUserName(String username) {
        return username;
    }
}
