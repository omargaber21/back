package com.example.myapplication.model.local

import androidx.room.*
import com.example.myapplication.model.entity.User

@Dao
interface UserDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addUser(user:User)
    @Delete
    fun deleteUser(user: User)
    @Query("Select * From user_table")
    fun getUsers():List<User>

}