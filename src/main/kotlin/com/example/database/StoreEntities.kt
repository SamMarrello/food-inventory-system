package com.example.database

import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object StoreTable: Table<StoreEntity>("stores") {
    val id = int("storeId").primaryKey().bindTo { it.id }
    val name = varchar("s_name").bindTo { it.name }
    val location = varchar("s_location").bindTo { it.location }
    val firstNameContact = varchar("s_firstNameContact").bindTo { it.firstnameContact }
    val lastNameContact = varchar("s_lastNameContact").bindTo { it.lastnameContact }
    val phoneNumber = int("s_phoneNumber").bindTo { it.phoneNumber }
    val specialization = varchar("specialization").bindTo { it.specialization }
}


interface StoreEntity: Entity<StoreEntity> {

    companion object : Entity.Factory<StoreEntity>()

    val id: Int
    val name: String
    val location: String
    val firstnameContact: String
    val lastnameContact: String
    val phoneNumber: Int
    val specialization: String
}

