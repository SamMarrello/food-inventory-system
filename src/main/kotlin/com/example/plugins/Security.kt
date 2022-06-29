package com.example.plugins

import io.ktor.server.auth.*
import io.ktor.util.*
import io.ktor.server.application.*
import io.ktor.server.auth.jwt.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureSecurity() {
    install(Authentication) {
        digest {

        }
    }
}
