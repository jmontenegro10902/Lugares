package com.example.lugares.data

import androidx.lifecycle.liveData
import androidx.room.*
import com.example.lugares.model.Lugar

@Dao
interface LugarDao {
    @Query("SELECT * FROM LUGAR")
    fun getAllData() : liveData<List<Lugar>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addLugar(lugar: Lugar)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun updateLugar(lugar: Lugar)

    @Delete
    suspend fun deleteLugar(lugar: Lugar)
}