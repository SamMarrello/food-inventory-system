package com.example.database


import org.ktorm.entity.Entity
import org.ktorm.schema.*


object ItemTable: Table<ItemEntity>("items") {
    val id = int("id").primaryKey().bindTo { it.id }
    val amount = int("amount").bindTo { it.amount }
    val name = varchar("name").bindTo { it.name }
    val expires = boolean("expires").bindTo { it.expires }
    //val expiry = datetime("expiry").bindTo { it.expiry }
}

interface ItemEntity: Entity<ItemEntity> {

    companion object : Entity.Factory<ItemEntity>()

    val id: Int
    val amount: Int
    val name: String
    val expires: Boolean
    //val expiry: String?
    //val warehouseLocation: Warehouse?
    //val storeLocation: Store?
}