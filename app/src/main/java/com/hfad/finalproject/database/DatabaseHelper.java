package com.hfad.finalproject.database;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by user on 9/7/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final int dbversion = 2;
    public static final String db_name = "db_contact";
    public static final String TBL_CONTACT = "contact";
    public static final String CONTACT_ID = "contact_id";
    public static final String CONTACT_NAME = "contact_name";
    public static final String GENDER = "contact_gender";
    public static final String CONTACT_EMAIL = "contact_email";
    public static final String Contact_Age = "contact_Age";
    public static final String CONTACT_EXTRAINFO = "contact_extraInfo";
    public static final String Contact_RATING = "contact_rating";
    public static final String CONTACT_EnrolledDate = "contact_EnrolledDate";


    public static final String CREATE_CONTACT_TABLE = "CREATE TABLE  "
            + TBL_CONTACT
            + "(id INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CONTACT_ID + " TEXT UNIQUE, "
            + CONTACT_NAME + " TEXT, "
            + GENDER + " TEXT, "
            + CONTACT_EMAIL + " TEXT, "
            + Contact_Age + " TEXT, "
            + CONTACT_EXTRAINFO + " TEXT, "
            + CONTACT_EnrolledDate + " TEXT, "
            + Contact_RATING + " TEXT) ";



    public DatabaseHelper(Context context) {
        super(context, db_name, null, dbversion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_CONTACT_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
