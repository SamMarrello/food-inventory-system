package com.example.controller

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.itemController() {
    routing {

        get("warehouse/*/items") {

        }

        get("store/*/items") {

        }

        get("warehouse/*/items/{id}") {

        }

        get("store/*/items/{id}") {

        }
    }
}