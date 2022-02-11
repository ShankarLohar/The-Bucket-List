package com.shankarlohar.thebucketlistapp;

import androidx.annotation.DrawableRes;

public class BucketElement {

    String name, description;
    int image;
    float rating;

    public BucketElement(String name, String description, @DrawableRes int image, float rating) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.rating = rating;
    }
}
