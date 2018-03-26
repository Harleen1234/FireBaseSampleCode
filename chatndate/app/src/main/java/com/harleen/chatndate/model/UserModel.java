package com.harleen.chatndate.model;

import com.google.firebase.database.Exclude;

/**
 * Created by Alessandro Barreto on 22/06/2016.
 */
public class UserModel {

    private String id;
    private String email;
    private String photo_profile;

    public UserModel() {
    }

    public UserModel(String email, String photo_profile) {
        this.email = email;
        this.photo_profile = photo_profile;

    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.email = email;
    }

    public String getPhoto_profile() {
        return photo_profile;
    }

    public void setPhoto_profile(String photo_profile) {
        this.photo_profile = photo_profile;
    }


}
