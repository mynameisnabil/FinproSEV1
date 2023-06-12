package com.example.finprov1.auth;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDao {

    @Query("SELECT * FROM user WHERE email = :email AND password = :password LIMIT 1")
    User login(String email, String password);

    @Insert(onConflict = OnConflictStrategy.FAIL)
    void register(User user);

    @Query("SELECT * FROM user WHERE email = :email")
    User checkEmail(String email);

    @Query("SELECT * FROM user WHERE uid = :userId")
    User getUser(int userId);

    @Update
    void update(User user);

}