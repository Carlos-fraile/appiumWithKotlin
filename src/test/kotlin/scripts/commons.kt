package scripts

import pages.baseAppium
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.IOException
import java.util.*

class commons : baseAppium() {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // PROPERTIES METHODS
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    fun getProperties(propertiesFileName: String): Properties {
        val properties = Properties()
        try {
            properties.load(FileInputStream(File(propertiesFileName)))
        } catch (e: FileNotFoundException) {
            throw AssertionError("File not found: $propertiesFileName. ${e.message}")
        } catch (e: IOException) {
            throw AssertionError("Exception while reading: $propertiesFileName. ${e.message}")
        }
        return properties
    }
}