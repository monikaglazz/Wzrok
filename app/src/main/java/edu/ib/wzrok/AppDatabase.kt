package edu.ib.wzrok

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import java.util.*

@Database(entities= arrayOf(Result::class),version = 2)
@TypeConverters(DateConverter::class)
abstract class AppDatabase: RoomDatabase() {
    abstract fun resultDao(): ResultDAO
}
