package com.example.easytripplanner;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {User.class},version = 2,exportSchema = false)
public abstract class UserDataBase extends RoomDatabase {
    public static Context dbcontext;
    public static UserDataBase getDataBaseInstance(){
        Builder<UserDataBase> tripUserBuilder= Room.databaseBuilder(dbcontext, UserDataBase.class,"User.db");
        return tripUserBuilder.build();
    }

    public abstract UserDao getDaoInstance();

}