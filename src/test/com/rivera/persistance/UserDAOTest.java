package com.rivera.persistance;

import com.rivera.entity.User;
import com.rivera.persistance.SessionFactoryProvider;
import com.rivera.persistance.UserDAO;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Kelly on 2/13/2017.
 */
public class UserDAOTest {

    private UserDAO userDAO;
    private static SessionFactory factory = SessionFactoryProvider.getSessionFactory();

    @Before
    public void setUp() throws Exception {
        Session session = factory.openSession();
        Transaction transaction = null;

        try {

            transaction = session.beginTransaction();
            session.createSQLQuery("INSERT INTO user (user_email, user_password, user_name) VALUES" +
                    "('leahrivera@gmail.com', 'leahriverapw', 'leahrivera')," +
                    "('gabrielarivera@gmail.com', 'gabrielariverapw', 'gabrielarivera')," +
                    "('adrianarivera@gmail.com', 'adrianariverapw', 'adrianarivera'),").executeUpdate();


        } catch (HibernateException hibernateException) {

            if (transaction != null) {

                transaction.rollback();

            }

        } finally {

            session.close();

        }
    }


    @Test
    public void addUsers() throws Exception {
        User user = new User ("kelly.rivera@wtsparadigm.com", "kellyriverapw", "kellyrivera");

        int user_id = userDAO.addUser(user);

        assertEquals("Add user test failed", 4, user_id);

    }

    @Test
    public void getUser() throws Exception {

    }

    @Test
    public void updateUser() throws Exception {

    }

    @Test
    public void removeUser() throws Exception {

    }

    @Test
    public void getUserByUserName() throws Exception {

    }

}