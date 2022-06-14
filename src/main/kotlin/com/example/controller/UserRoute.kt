package com.example.controller

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.UserRouting() {
    routing {
        get("/user") {

        }
        get("/user/{id}") {
            val id = call.parameters["id"] ?: return@get call.respond(status = HttpStatusCode.BadRequest,
                "ID cannot be nothing")
        }
    }
}