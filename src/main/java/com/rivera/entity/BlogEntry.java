package com.rivera.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Kelly on 2/12/2017.
 */
@Entity
@Table(name="blog_entries")
public class BlogEntry {




    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_blog_entries")
    private int userId;

    @Column(name = "blog_date")
    private String blogDate;

    @Column(name = "blog_title")
    private String blogTitle;

    @Column(name = "blog_show")
    private Boolean blogShow;

    @Column(name = "blog_auto_post_date_time")
    private String blogAutoPostDate;

    @Column(name = "blog_entry_content")
    private String blogEntryContent;

    public BlogEntry() {

    }


    public BlogEntry(String blogDate, String blogTitle, Boolean blogShow, String blogAutoPostDate, String blogEntryContent) {
        this.blogDate = blogDate;
        this.blogTitle = blogTitle;
        this.blogShow = blogShow;
        this.blogAutoPostDate = blogAutoPostDate;
        this.blogEntryContent = blogEntryContent;

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(String blogDate) {
        this.blogDate = blogDate;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public Boolean getBlogShow() {
        return blogShow;
    }

    public void setBlogShow(Boolean blogShow) {
        this.blogShow = blogShow;
    }

    public String getBlogAutoPostDate() {
        return blogAutoPostDate;
    }

    public void setBlogAutoPostDate(String blogAutoPostDate) {
        this.blogAutoPostDate = blogAutoPostDate;
    }

    public String getBlogEntryContent() {
        return blogEntryContent;
    }

    public void setBlogEntryContent(String blogEntryContent) {
        this.blogEntryContent = blogEntryContent;
    }
}
