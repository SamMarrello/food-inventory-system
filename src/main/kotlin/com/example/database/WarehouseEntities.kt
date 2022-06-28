package com.example.database

import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object WarehouseTable: Table<WarehouseEntity>("warehouses") {
    val id = int("id").primaryKey().bindTo { it.id }
    val name = varchar("w_name").bindTo { it.name }
    val location = varchar("w_location").bindTo { it.location }
    val firstNameContact = varchar("firstNameContact").bindTo { it.firstNameContact }
    val lastNameContact = varchar("lastNameContact").bindTo { it.lastNameContact }
    val phoneNumber = int("phoneNumber").bindTo { it.phoneNumber }
}

interface WarehouseEntity: Entity<WarehouseEntity> {

    companion object : Entity.Factory<WarehouseEntity>()

    val id: Int
    val name: String
    val location: String
    val firstNameContact: String
    val lastNameContact: String
    val phoneNumber: Int
}