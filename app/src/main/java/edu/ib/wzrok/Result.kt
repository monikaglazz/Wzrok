package edu.ib.wzrok

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters

import java.util.*

@Entity(tableName = "results")
data class Result (
    @PrimaryKey(autoGenerate = true) val uid: Int,
    @ColumnInfo(name = "visusL") val visusL: Float,
    @ColumnInfo(name = "visusR") val visusR: Float,
    @ColumnInfo(name = "visusB") val visusB: Float,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "date")  val date: Date

){

}