package eu.tutorials.mywishlistapp2

import android.content.Context
import androidx.room.Room
import eu.tutorials.mywishlistapp2.data.WishDatabase
import eu.tutorials.mywishlistapp2.data.WishRepository

object Graph {
    lateinit var database: WishDatabase

    val wishRepository by lazy{
        WishRepository(wishDao = database.wishDao())
    }

    fun provide(context: Context){
        database = Room.databaseBuilder(context, WishDatabase::class.java, "wishlist.db").build()
    }

}