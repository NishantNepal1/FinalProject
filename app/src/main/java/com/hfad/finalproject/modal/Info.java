package com.hfad.finalproject.modal;

import android.widget.RatingBar;

/**
 * Created by user on 9/17/2016.
 */
public class Info {
    String name;
    String age;
    String gender;
    String enrolledDate;
    String extraInfo;
    RatingBar rating;
    String email;
    String id;
    String ratingInInt=rating.toString();

    public String getRatingInInt() {
        return ratingInInt;
    }

    public void setRatingInInt(String ratingInInt) {
        this.ratingInInt = ratingInInt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEnrolledDate() {
        return enrolledDate;
    }

    public void setEnrolledDate(String enrolledDate) {
        this.enrolledDate = enrolledDate;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo() {
        this.extraInfo = extraInfo;
    }

    public RatingBar getRating() {
        return rating;
    }

    public void setRating(RatingBar rating) {
        this.rating = rating;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
