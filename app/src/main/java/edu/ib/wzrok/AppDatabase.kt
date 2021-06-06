package edu.ib.wzrok

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import java.util.*

@Database(entities= arrayOf(Result::class),version = 1)

abstract class AppDatabase: RoomDatabase() {
    abstract fun resultDao(): ResultDAO
}
