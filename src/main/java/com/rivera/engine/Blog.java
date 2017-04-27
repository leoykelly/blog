package com.rivera.engine;

import com.rivera.entity.BlogEntry;
import com.rivera.persistance.BlogEntriesDAO;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by Kelly on 4/27/2017.
 */
public class Blog {

    private final Logger log = Logger.getLogger(this.getClass());

    public void listEntires() {
        BlogEntriesDAO blogdao = new BlogEntriesDAO();
        List<BlogEntry> entries = blogdao.getAllEntries();

        for(BlogEntry entry : entries ){
            log.error(entry);
        }
    }
}
