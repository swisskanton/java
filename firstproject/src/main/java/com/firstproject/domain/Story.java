package com.firstproject.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;
@Entity
public class Story {

    @GeneratedValue
    @Id
    private long id;
    private String title;
    private String content;
    private Date posted;
    @ManyToOne
    private Blogger blogger;

    public Story() {}

    public Story(String title, String content, Date posted, Blogger bloggerr) {
        this.title = title;
        this.content = content;
        this.posted = posted;
        this.blogger = bloggerr;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPosted() {
        return posted;
    }

    public void setPosted(Date lastUpdate) {
        this.posted = lastUpdate;
    }

    public Blogger getBlogger() {
        return blogger;
    }

    public void setBlogger(Blogger blogger) {
        this.blogger = blogger;
    }
    @Override
    public String toString() {
        return "Story [title=" + this.getTitle() + "]";
    }
}
