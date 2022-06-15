package com.example.repository

import com.example.model.DBConnection
import com.example.model.Warehouse
import org.ktorm.database.Database

interface WarehouseRepository {

    fun getAllWarehouses(): List<Warehouse> {
        return getAllWarehouses()
            .map {Warehouse(it.id, it.name, it.location, it.firstnameContact, it.lastnameContact, it.phoneNumber)}
    }

    fun getWarehouse(id: Int): Warehouse? {
        TODO()
    }
}