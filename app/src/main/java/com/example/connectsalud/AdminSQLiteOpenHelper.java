/*
package com.example.connectsalud;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {
    public AdminSQLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQLiteDatabase sqLiteDatabase, int i, int i1)
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table usuarios (\n" +
                "\tiddni integer primary key,\n" +
                "\tnombre text,\n" +
                "\tapellido text,\n" +
                "\ttelefono integer,\n" +
                "\tnacimiento text,\n" +
                "\temail text,\n" +
                "\tpass text,\n" +
                "\ttipousuario text\n" +
                ")");
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
*/