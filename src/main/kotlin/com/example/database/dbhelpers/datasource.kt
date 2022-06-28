package com.example.model

import com.example.database.WarehouseEntity
import com.example.database.WarehouseTable
import com.example.database.WarehouseTable.id
import com.example.database.password
import org.ktorm.database.Database
import org.ktorm.dsl.delete
import org.ktorm.dsl.eq
import org.ktorm.dsl.insertAndGenerateKey
import org.ktorm.dsl.update
import org.ktorm.entity.firstOrNull
import org.ktorm.entity.sequenceOf
import org.ktorm.entity.toList
import org.ktorm.logging.ConsoleLogger
import org.ktorm.logging.LogLevel

open class DBHelper {

    private val database: Database = Database.connect(
        url = "jdbc:mysql://localhost:3306/ktorm",
        driver = "com.mysql.jdbc.Driver",
        user = "root",
        password = password,
        logger = ConsoleLogger(threshold = LogLevel.INFO)
    )

    fun getAllWarehouses(): List<WarehouseEntity> {
        return database.sequenceOf(WarehouseTable).toList()
    }

    fun getWarehouse(id: Int): WarehouseEntity? {
        return database.sequenceOf(WarehouseTable)
            .firstOrNull {it.id eq id}
    }

    fun addWarehouse(draft: WarehouseDraft): Warehouse {
        val insertedId = database.insertAndGenerateKey(WarehouseTable) {
            set(WarehouseTable.name, draft.name)
            set(WarehouseTable.location, draft.location)
            set(WarehouseTable.firstNameContact, draft.firstnameContact)
            set(WarehouseTable.lastNameContact, draft.lastnameContact)
            set(WarehouseTable.phoneNumber, draft.phoneNumber)
        } as Int

        return Warehouse(insertedId, draft.name, draft.location,
            draft.firstnameContact, draft.lastnameContact, draft.phoneNumber)
    }

    fun updateWarehouse(id: Int, draft: WarehouseDraft): Boolean {
        val updatedRows = database.update(WarehouseTable) {
            set(WarehouseTable.name, draft.name)
            set(WarehouseTable.location, draft.location)
            set(WarehouseTable.firstNameContact, draft.firstnameContact)
            set(WarehouseTable.lastNameContact, draft.lastnameContact)
            set(WarehouseTable.phoneNumber, draft.phoneNumber)
            where {
                it.id eq id
            }
        }
        return updatedRows > 0
    }

    fun deleteWarehouse(id: Int): Boolean {
        val deletedRows = database.delete(WarehouseTable) {
            it.id eq id
        }

        return deletedRows > 0
    }
}
