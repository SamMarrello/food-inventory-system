package com.example.controller

import com.example.database.getAllWarehouses
import com.example.repository.WarehouseRepository
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.warehouseController() {
    val warehouseRepo: WarehouseRepository = TODO()
    routing {
        get("/warehouse") {
            getAllWarehouses()
        }
        get("/warehouse/{id}") {

        }
    }
}