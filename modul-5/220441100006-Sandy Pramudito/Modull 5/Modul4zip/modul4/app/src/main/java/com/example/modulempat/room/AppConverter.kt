package com.example.modulempat.room

import androidx.room.TypeConverter
import java.io.File

class AppConverter {
    // Fungsi ini mengubah objek File menjadi String (path file)
    @TypeConverter
    fun fromFile(file: File?): String? {
        // Mengembalikan path dari file jika file tidak null, jika null maka mengembalikan null
        return file?.path
    }

    // Fungsi ini mengubah String (path file) menjadi objek File
    @TypeConverter
    fun toFile(path: String?): File? {

        return if (path != null) File(path) else null
    }
}