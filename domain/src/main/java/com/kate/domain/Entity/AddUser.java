package com.kate.domain.Entity;

import android.content.Context;

/**
 * Created by kate on 06.09.2017.
 */

public class AddUser {

    Context context;
    private User user;

    public AddUser(Context context, User user) {
        this.context = context;
        this.user = user;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
