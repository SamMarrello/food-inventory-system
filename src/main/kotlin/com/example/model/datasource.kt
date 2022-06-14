package com.example.model

import org.ktorm.database.Database
import org.ktorm.logging.ConsoleLogger
import org.ktorm.logging.LogLevel

val password = getPassword();

val database = Database.connect(
    url = "jdbc:mysql://localhost:3306/ktorm",
    driver = "com.mysql.jdbc.Driver",
    user = "root",
    password = password,
    logger = ConsoleLogger(threshold = LogLevel.INFO)
)
