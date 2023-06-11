package com.example.finprov1.transaction;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import java.util.List;

@Dao
public interface pfTransactionDao {
    @Query("SELECT * FROM PfTransaction WHERE uid = :uid")
    List<PfTransaction> getAll(Integer uid);


    @Insert
    void pfAddTransaksi(PfTransaction pftransaksi);

    @Delete
    void pfDeleteTransaksi(PfTransaction pftransaksi);

    @Update
    void pfUpdate(PfTransaction pftransaksi);
}
