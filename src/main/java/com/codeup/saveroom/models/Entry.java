package com.codeup.saveroom.models;

import java.util.Date;

public class Entry {

    private String username;

    private String gameTitle;

    private Date date;

    private Integer rating;

    private Integer likes;

    private String entry;

    private Integer entryNo;

//    comments

//    tags

//    spoiler warning


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public Integer getEntryNo() {
        return entryNo;
    }

    public void setEntryNo(Integer entryNo) {
        this.entryNo = entryNo;
    }

}

