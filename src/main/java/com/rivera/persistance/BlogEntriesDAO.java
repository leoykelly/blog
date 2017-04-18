package com.rivera.persistance;

import com.rivera.entity.BlogEntry;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;




/**
 * Created by Kelly on 2/12/2017.
 */
public class BlogEntriesDAO {

    private final Logger log = Logger.getLogger(this.getClass());


    public int addEntry(BlogEntry blogEntry) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        int id_blog_entries = (Integer) session.save(blogEntry);
        transaction.commit();
        return id_blog_entries;
    }

    public BlogEntry getEntry(int id_blog_entries) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        BlogEntry blogEntry = null;
        try {
            blogEntry = (BlogEntry) session.get(BlogEntry.class, id_blog_entries);
        } catch (Exception exception) {
            log.error("Hibrenate Exception");
        }
        return blogEntry;
    }
}
