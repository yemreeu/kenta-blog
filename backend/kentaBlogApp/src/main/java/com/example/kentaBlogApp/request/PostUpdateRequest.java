package com.example.kentaBlogApp.request;

import lombok.Data;


public class PostUpdateRequest {
    String text;
    String title;

    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
}
