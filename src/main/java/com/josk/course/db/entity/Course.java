package com.josk.course.db.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "courses")
public class Course {

    @Id
//    auto incremented field
    @GeneratedValue(strategy = GenerationType.AUTO)
//    primary key
    private long id;

    @Column(name = "title", columnDefinition = "nvarchar(45)")
    private String title;

    @Column(name = "description", columnDefinition = "nvarchar(45)")
    private String description;

    @Column(name = "published", columnDefinition = "boolean")
    private Boolean published;

    @Column(name = "published_date", columnDefinition = "datetime2(6)")
    @CreatedDate
    private LocalDateTime publishedDate;

    public Course() {

    }

    public Course(String title, String description, Boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
//        this.publishedDate = publishedDate;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public LocalDateTime getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDateTime publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }

}
