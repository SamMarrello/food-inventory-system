package com.example.model

import com.example.database.password
import org.ktorm.database.Database
import org.ktorm.logging.ConsoleLogger
import org.ktorm.logging.LogLevel



class DBHelper {
     fun DBConnection(): Database {
        val database = Database.connect(
            url = "jdbc:mysql://localhost:3306/ktorm",
            driver = "com.mysql.jdbc.Driver",
            user = "root",
            password = "$password",
            logger = ConsoleLogger(threshold = LogLevel.INFO)
        )

        return database
    }
}
