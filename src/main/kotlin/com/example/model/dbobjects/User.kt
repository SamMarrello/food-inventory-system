package com.example.model.dbobjects

import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object UserTable: Table<UserEntity>("Users") {
    val id = int("id").primaryKey().bindTo { it.id }
    val username = varchar("username").bindTo { it.username }
    val password = varchar("password").bindTo { it.password }
    val authority = varchar("authority").bindTo { it.authority }
}

interface UserEntity: Entity<UserEntity> {

    companion object : Entity.Factory<UserEntity>()

    val id: Int
    val username: String
    val password: String
    val authority: String
}