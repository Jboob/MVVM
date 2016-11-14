package com.jboob.mvvm.model;

import android.databinding.BaseObservable;

/**
 * Created by J-boo on 2016/11/14.
 */
public class User extends BaseObservable {

    private final String firstName;
    private final String lastName;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
}
