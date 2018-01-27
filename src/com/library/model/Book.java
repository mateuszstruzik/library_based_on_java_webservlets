package com.library.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by MATI on 08.01.2018.
 */
public class Book {

    @XmlElement(name="id")
    private String id;

    public String getIdget() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement(name="author")
    private String Author;

    public String getAuthorget() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @XmlElement(name="title")
    private String Title;

    public String getTitleget() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    @XmlElement(name="genre")
    private String Genre;

    public String getGenreget() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    @XmlElement(name="status")
    private String Status;

    public String getStatusget() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @XmlElement(name="publish_date")
    private String Publish_date;

    public String getPublish_dateget() {
        return Publish_date;
    }

    public void setPublish_date(String publish_date) {
        Publish_date = publish_date;
    }

    @XmlElement(name="description")
    private String Description;

    public String getDescriptionget() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
