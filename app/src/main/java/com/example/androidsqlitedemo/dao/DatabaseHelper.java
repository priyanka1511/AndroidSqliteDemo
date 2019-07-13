package com.example.androidsqlitedemo.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + FeedEntry.TABLE_NAME + " (" +
                    FeedEntry._ID + " INTEGER PRIMARY KEY," +
                    FeedEntry.COLUMN_NAME_NAME + " TEXT," +
                    FeedEntry.COLUMN_NAME_FATHERNAME + " TEXT," +
                    FeedEntry.COLUMN_NAME_ROLLNO + " TEXT," +
                    FeedEntry.COLUMN_NAME_CONTACT + " TEXT)";

    private static final String SQL_DELETE_TABLE =
            "DROP TABLE IF EXISTS " + FeedEntry.TABLE_NAME;
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "UserEntries.db";


    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_TABLE);
        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "student";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_FATHERNAME = "fathername";
        public static final String COLUMN_NAME_CONTACT = "contact";
        public static final String COLUMN_NAME_ROLLNO = "rollnumber";
    }

}
