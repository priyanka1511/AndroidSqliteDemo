package com.example.androidsqlitedemo.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.androidsqlitedemo.model.User;

import java.util.List;

public class MyController {
    private static DatabaseHelper dbHelper ;
    public static void init(Context context){
        dbHelper = new DatabaseHelper(context);
    }
    public static long addUser(User user){
        SQLiteDatabase db =dbHelper.getWritableDatabase();
        ContentValues dataValues=new ContentValues();
        dataValues.put(DatabaseHelper.FeedEntry.COLUMN_NAME_NAME,user.getsName());
        dataValues.put(DatabaseHelper.FeedEntry.COLUMN_NAME_FATHERNAME,user.getfName());
        dataValues.put(DatabaseHelper.FeedEntry.COLUMN_NAME_CONTACT,user.getContact());
        dataValues.put(DatabaseHelper.FeedEntry.COLUMN_NAME_ROLLNO,user.getNumber());
        return db.insert(DatabaseHelper.FeedEntry.TABLE_NAME,null,dataValues);
    }
    public static User fetchUser(int rn){
        return null;

    }
    public static List<User> fetchAllUser(){
        return null;
    }
    public static boolean deleteUser(int rn){
        return false;
    }

    public static boolean deleteAllUser(int rn){
        return false;
    }
}