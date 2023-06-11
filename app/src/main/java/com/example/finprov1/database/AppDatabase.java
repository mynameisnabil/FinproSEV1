package com.example.finprov1.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.finprov1.auth.User;
import com.example.finprov1.auth.UserDao;
import com.example.finprov1.transaction.PfTransaction;
import com.example.finprov1.transaction.pfTransactionDao;

@Database(entities = {User.class, PfTransaction.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract pfTransactionDao pftransactionDao();
    public abstract UserDao userDao();

    private static AppDatabase Instance;

    public static AppDatabase getInstance(Context context) {
        if(Instance == null) {
            Instance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "FINPROV1_DB")
                    .allowMainThreadQueries()
                    .build();
        }

        return Instance;
    }

}
