package com.example.controller

import com.example.model.User
import com.example.model.UserDraft
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.routing.*

fun Application.login() {

    //val userRepo =

    routing {

        post("/login") {
            call.receive<User>()




        }

        put("/login/{id}") {
            call.receive<UserDraft>()
        }
    }

}