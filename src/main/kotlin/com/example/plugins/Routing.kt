package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.plugins.autohead.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.application.*
import io.ktor.server.freemarker.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import javax.security.sasl.AuthenticationException

fun Application.configureRouting() {
    install(AutoHeadResponse)

    routing {
        get("/") {
            call.respond(FreeMarkerContent("index.ftl", mapOf("null" to null)))
        }
    }
}
