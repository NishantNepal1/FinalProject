package com.hfad.finalproject.appllication;

import android.app.Application;

import com.hfad.finalproject.database.DatabaseManager;

/**
 * Created by user on 9/18/2016.
 */
public class MyApplication extends Application {
    private DatabaseManager dbDatabaseManager;
    @Override
    public void onCreate() {
        super.onCreate();
        dbDatabaseManager= DatabaseManager.newInstance(this);
    }
    public DatabaseManager getDbDatabaseManager()
    {
        return dbDatabaseManager;
    }



}
