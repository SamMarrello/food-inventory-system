package com.example.repository

import com.example.database.dbhelpers.WarehouseHelper
import com.example.model.DBHelper
import com.example.model.Warehouse
import com.example.model.WarehouseDraft
import org.ktorm.database.Database

class WarehouseRepository {

    private val database = WarehouseHelper()

    fun getAllWarehouses(): List<Warehouse> {
        return database.getAllWarehouses()
            .map { Warehouse(it.id, it.name, it.location, it.firstNameContact, it.lastNameContact, it.phoneNumber) }
    }

    fun getWarehouse(id: Int): Warehouse? {
        return database.getWarehouse(id)
            ?.let { Warehouse(it.id, it.name, it.location, it.firstNameContact, it.lastNameContact, it.phoneNumber) }
    }

    fun addWarehouse(draft: WarehouseDraft): Warehouse {
        return database.addWarehouse(draft)
    }

    fun updateWarehouse(id: Int, draft: WarehouseDraft): Boolean {
        return database.updateWarehouse(id, draft)
    }

    fun deleteWarehouse(id: Int): Boolean {
        return database.deleteWarehouse(id)
    }

}