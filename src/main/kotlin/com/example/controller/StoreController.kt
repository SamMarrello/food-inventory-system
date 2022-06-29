package com.example.controller

import com.example.model.StoreDraft
import com.example.repository.StoreRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.storeController() {

    val storeRepo = StoreRepository()

    routing {
        get("/stores") {

        }

        get("/stores/{id}") {
            val id = call.parameters["id"]?.toIntOrNull()

            if (id == null) {
                call.respond(
                    HttpStatusCode.BadRequest,
                    "id has to be a number"
                )
                return@get
            }
        }

        post("/stores") {
            val draft = call.receive<StoreDraft>()
        }

        put("/stores/{id}") {
            val id = call.parameters["id"]?.toIntOrNull()

            if (id == null) {
                call.respond(
                    HttpStatusCode.BadRequest,
                    "id has to be a number"
                )
                return@put
            }
        }

        delete("/stores/{id}") {
            val id = call.parameters["id"]?.toIntOrNull()

            if (id == null) {
                call.respond(
                    HttpStatusCode.BadRequest,
                    "id has to be a number"
                )
                return@delete
            }
        }
    }

}