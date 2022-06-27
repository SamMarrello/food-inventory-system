package com.example.database

import com.example.model.DBConnection
import com.example.model.DBHelper
import org.ktorm.database.Database
import org.ktorm.entity.Entity
import org.ktorm.entity.sequenceOf
import org.ktorm.entity.toList
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

private val database: Database = DBHelper.

object WarehouseTable: Table<WarehouseEntity>("warehouses") {
    val id = int("id").primaryKey().bindTo { it.id }
    val name = varchar("w_name").bindTo { it.name }
    val firstNameContact = varchar("firstNameContact").bindTo { it.firstNameContact }
    val lastNameContact = varchar("lastNameContact").bindTo { it.lastNameContact }
    val phoneNumber = int("phoneNumber").bindTo { it.phoneNumber }
}

interface WarehouseEntity: Entity<WarehouseEntity> {

    companion object : Entity.Factory<WarehouseEntity>()

    val id: Int
    val name: String
    val firstNameContact: String
    val lastNameContact: String
    val phoneNumber: Int
}

fun getAllWarehouses(): List<WarehouseEntity> {
    return database.sequenceOf(WarehouseTable).toList()
}
