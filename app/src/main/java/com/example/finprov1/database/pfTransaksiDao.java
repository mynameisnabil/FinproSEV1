package com.example.finprov1.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import java.util.List;

@Dao
public interface pfTransaksiDao {
    @Query("SELECT * FROM 'pftransaksi' WHERE uid = :uid")
    List<PfTransaksi> getAll(Integer uid);


    @Insert
    void pfAddTransaksi(PfTransaksi pftransaksi);

    @Delete
    void pfDeleteTransaksi(PfTransaksi pftransaksi);

    @Update
    void pfUpdate(PfTransaksi pftransaksi);
}
