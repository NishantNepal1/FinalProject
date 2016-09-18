package com.hfad.finalproject.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.hfad.finalproject.modal.Info;

import java.util.ArrayList;

/**
 * Created by user on 9/17/2016.
 */
public class DatabaseManager {
    private static DatabaseManager INSTANCE;
    SQLiteDatabase db;

    private DatabaseManager(Context mContext) {
        DatabaseHelper dbHelper = new DatabaseHelper(mContext);
        this.db = dbHelper.getWritableDatabase();
    }

    public static DatabaseManager newInstance(Context mContext) {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseManager(mContext);
        }
        return INSTANCE;
    }


    public void addContact(ArrayList<Info> contacts) {
        for (Info contact : contacts) {

            if (!isContactExists(contact)) {
                addContact(contact);
            }
        }
    }

    private boolean isContactExists(Info contact) {
        String query = "SELECT * From " + DatabaseHelper.TBL_CONTACT + " WHERE " + DatabaseHelper.CONTACT_ID + " = '" + contact.getId() + "'";
        Cursor cursor = db.rawQuery(query, null);
        return cursor.getCount() > 0;

    }

    public void addContact(Info contact) {
        ContentValues cv = new ContentValues();
        cv.put(DatabaseHelper.CONTACT_NAME, contact.getName());
        cv.put(DatabaseHelper.CONTACT_ID, contact.getId());
        cv.put(DatabaseHelper.CONTACT_EMAIL, contact.getEmail());
        cv.put(DatabaseHelper.GENDER, contact.getGender());
        cv.put(DatabaseHelper.CONTACT_EMAIL, contact.getEmail());
        cv.put(DatabaseHelper.CONTACT_EXTRAINFO, contact.getExtraInfo());
        cv.put(DatabaseHelper.Contact_RATING, contact.getRatingInInt());
        cv.put(DatabaseHelper.CONTACT_EnrolledDate, contact.getEnrolledDate());
        db.insert(DatabaseHelper.TBL_CONTACT, null, cv);
    }

    public void deleteContact(String contactId) {
        int i = db.delete(DatabaseHelper.TBL_CONTACT, DatabaseHelper.CONTACT_ID + "='" + contactId + "='", null);
        Log.e("tag", i + "");
    }

    public void updateContact(String contactId, String updateName, String updateEmail, String updateAge, String updateGender,String updateRating, String updateExtraInfo) {
        ContentValues cv = new ContentValues();
        cv.put(DatabaseHelper.CONTACT_NAME, updateName);
        cv.put(DatabaseHelper.CONTACT_EMAIL, updateEmail);
        cv.put(DatabaseHelper.GENDER, updateGender);
        cv.put(DatabaseHelper.Contact_RATING, updateRating);
        cv.put(DatabaseHelper.Contact_Age, updateAge);
        cv.put(DatabaseHelper.CONTACT_EXTRAINFO, updateExtraInfo);
        db.update(DatabaseHelper.TBL_CONTACT, cv, DatabaseHelper.CONTACT_ID + "='" + contactId + "='", null);
    }

    public ArrayList<Info> fetchContact() {
        String query = "SELECT * FROM " + DatabaseHelper.TBL_CONTACT;
        Cursor cursor = db.rawQuery(query, null);
        ArrayList<Info> infoArrayList = new ArrayList<>();
        while (cursor.moveToNext()) {
            Info info = new Info();
            info.setName(cursor.getString(cursor.getColumnIndex(DatabaseHelper.CONTACT_NAME)));
            info.setEmail(cursor.getString(cursor.getColumnIndex(DatabaseHelper.CONTACT_EMAIL)));
            info.setGender(cursor.getString(cursor.getColumnIndex(DatabaseHelper.GENDER)));
            info.setAge(cursor.getString(cursor.getColumnIndex(DatabaseHelper.Contact_Age)));
            info.setEmail(cursor.getString(cursor.getColumnIndex(DatabaseHelper.CONTACT_EMAIL)));
            info.setEnrolledDate(cursor.getString(cursor.getColumnIndex(DatabaseHelper.CONTACT_EnrolledDate)));
            info.setId(cursor.getString((cursor.getColumnIndex(DatabaseHelper.CONTACT_ID))));
            info.setRatingInInt(cursor.getString(cursor.getColumnIndex(DatabaseHelper.Contact_RATING)));
            infoArrayList.add(info);
        }
        return infoArrayList;
    }
}
