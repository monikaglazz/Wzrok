package edu.ib.wzrok

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ResultDAO {
    @Query("SELECT * from results")
    fun getAll(): List<Result>

    @Insert
    fun insert( result: Result): Long
    @Insert
    fun insertAll(vararg results: Result): List<Long>

    @Delete
    fun delete(result: Result)
}