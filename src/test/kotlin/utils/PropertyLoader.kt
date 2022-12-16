package utils

import java.io.File
import java.io.FileInputStream
import java.io.IOException
import java.util.*

class PropertyLoader {
    fun loadProperties(propertiesFile: String): Properties? {
        val filePath = "src/test/resources/properties/params/$propertiesFile"
        val file = File(filePath)
        return try {
            val fileInput = FileInputStream(file)
            val properties = Properties()
            properties.load(fileInput)
            fileInput.close()
            properties
        } catch (e: IOException) {
            e.printStackTrace()
            null
        }
    }
}