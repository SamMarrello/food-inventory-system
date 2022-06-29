package com.example.database

import com.example.database.UserTable.bindTo
import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object UserTable: Table<UserEntity>("users") {

    val id = int("id").primaryKey().bindTo { it.id }
    val username = varchar("username").bindTo { it.username }
    val password = varchar("password").bindTo { it.password }
    //val storeId = int("storeid").bindTo { it.storeId }
    //val warehouseId = int("storeid").bindTo { it.warehouseId }
}

interface UserEntity: Entity<UserEntity> {

    companion object : Entity.Factory<UserEntity>()

    val id: Int
    val username: String
    val password: String
    val storeId: String?
    val warehouseId: String?
}