package com.rivera.persistancetests;

import com.rivera.persistance.BlogEntriesDAO;
import org.apache.log4j.Logger;
import org.junit.Before;
/**
 * Created by Kelly on 5/3/2017.
 */
public class BlogEntiresDAOTest {

    Logger log = Logger.getLogger(this.getClass());
    BlogEntriesDAO blogEntriesDAO;

    //TODO: maybe parse the details of the response to map sub classes?
    //TODO: check the type before response is mapped, then map to that class.

    @Before
    public void setUp() throws Exception {

        blogEntriesDAO = new BlogEntriesDAO();

    }
/*
    @Test
    public void getItem() throws Exception {
        List<BlogEntry> blogEntryList = null;
        blogEntryList = blogEntriesDAO.getAllEntries();

        log.info(blogEntryList.getClass().toString());

        assertEquals("Failed to retrieve correct Item.", 2, blogEntryList.size());


        log.info("");
    }
*/
}