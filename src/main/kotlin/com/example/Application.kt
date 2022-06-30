package com.example

import com.example.controller.itemController
import com.example.controller.login
import com.example.controller.storeController
import com.example.controller.warehouseController
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "localhost") {
        configureMonitoring()
        configureHTTP()
        configureRouting()
        configureSerialization()
        configureSecurity()
        warehouseController()
        storeController()
        itemController()
        login()
    }.start(wait = true)
}
