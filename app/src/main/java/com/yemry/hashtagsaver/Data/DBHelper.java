package com.yemry.hashtagsaver.Data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "shelter.db";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + HashtagListEntry.TABLE_NAME + " (" +
                    HashtagListEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    HashtagListEntry.COLUMN_DATE_TIME + " INTEGER," +
                    HashtagListEntry.HASHTAG_LIST + " TEXT," +
                    HashtagListEntry.HASHTAG_LIST_NAME + " TEXT)";


    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //place the logic to upgrade the schema here
        switch (oldVersion)
        {
            case 1:
            default:
                return;
        }
    }
}
