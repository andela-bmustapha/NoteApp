package com.bmustapha.noteapp;


import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;


public class NoteAppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Parse.initialize(this, "qPRe9hX4uY7kUGaJAOwA4tbv3fWfXTatdBqrspmx", "8ffN9UHehZfwsYbaqFiUFiZvyisjmcv5V0V3CaFJ");

        // ParseObject testObject = new ParseObject("TestObject");
        // testObject.put("foo", "bar");
        // testObject.saveInBackground();
    }

}
