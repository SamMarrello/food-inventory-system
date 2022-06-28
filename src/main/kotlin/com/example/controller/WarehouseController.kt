package com.example.controller

import com.example.model.WarehouseDraft
import com.example.repository.WarehouseRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.warehouseController() {

    val warehouseRepo = WarehouseRepository()

    routing {
        get("/warehouse") {
            call.respond(warehouseRepo.getAllWarehouses())
        }

        get("/warehouse/{id}") {
            val id = call.parameters["id"]?.toIntOrNull()

            if (id == null) {
                call.respond(
                    HttpStatusCode.BadRequest,
                    "id has to be a number"
                )
                return@get
            }
            call.respond(warehouseRepo.getWarehouse(id?))
        }

        post("/warehouse") {
            val draft = call.receive<WarehouseDraft>()
            val warehouse = warehouseRepo.addWarehouse(draft)
            call.respond(warehouse)
        }

        put("/warehouse/{id}") {
            val id = call.parameters["id"]?.toIntOrNull()

            if (id == null) {
                call.respond(
                    HttpStatusCode.BadRequest,
                    "id has to be a number"
                )
                return@put
            }
            val draft = call.receive<WarehouseDraft>()
            val update = (warehouseRepo.updateWarehouse(id, draft))

            if (update) {
                call.respond(HttpStatusCode.OK)
            }
            else {
                call.respond(HttpStatusCode.NotFound,
                "found no warehouse with the id $id")
            }
        }

        delete("/warehouse/{id}") {
            val id = call.parameters["id"]?.toIntOrNull()

            if (id == null) {
                call.respond(
                    HttpStatusCode.BadRequest,
                    "id has to be a number"
                )
                return@delete
            }
            val update = warehouseRepo.deleteWarehouse(id)

            if (update) {
                call.respond(HttpStatusCode.OK)
            }
            else {
                call.respond(HttpStatusCode.NotFound,
                    "found no warehouse with the id $id")
            }
        }
    }
}