package com.tryingrestapi.demo.model;


import org.hibernate.annotations.*;
import javax.persistence.*;
import javax.persistence.Entity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private  String title;
    @Column(length = 1000000)
    @Lob
    private String body;
    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date date;

    public  Post(){
        super();
    }

    public Post(String title, String body){
        this();
        this.title = title;
        this.body = body;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDateStr(){
        DateFormat outputFormatter = new SimpleDateFormat("MM/dd/yyyy");
        return  outputFormatter.format(this.date);
    }

    @Override
    public  boolean equals(Object o){
        if (!(o instanceof Post))
            return  false;
        Post otherPost = (Post) o;
        return this.title.equals(otherPost.getTitle()) &&
                this.body.equals(otherPost.getBody());
    }
}
