package com.example.app

import androidx.room.*

@Dao
interface ProductDAO {
    @Insert
    fun insert(p: ProductModel): Long

    @Update
    fun update(p: ProductModel): Int

    @Delete
    fun delete(p: ProductModel)

    @Query("SELECT * FROM Product WHERE id = :id")
    fun getById(id: Int): ProductModel

    @Query("SELECT * FROM Product WHERE is_available = :av")
    fun getAvailables(av: Int): List<ProductModel>
}