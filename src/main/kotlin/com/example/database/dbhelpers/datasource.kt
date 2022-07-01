package com.example.model

import com.example.database.password
import org.ktorm.database.Database
import org.ktorm.logging.ConsoleLogger
import org.ktorm.logging.LogLevel

open class DBHelper {

    val database: Database = Database.connect(
        url = "jdbc:mysql://localhost:3306/inventory",
        driver = "com.mysql.cj.jdbc.Driver",
        user = "root",
        password = password,
        logger = ConsoleLogger(threshold = LogLevel.INFO)
    )
}
