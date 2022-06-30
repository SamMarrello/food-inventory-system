package com.example

import com.example.controller.storeController
import com.example.controller.warehouseController
import io.ktor.http.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlin.test.*
import io.ktor.server.testing.*
import com.example.plugins.*

class ControllerTest {
    @Test
    fun testRoot() = testApplication {
        application {
            configureRouting()
        }
        client.get("/").apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("Hello World!", bodyAsText())
        }
    }

    @Test
    fun testWarehouse() = testApplication {
        application {
            warehouseController()
        }

        client.get("/warehouse") {

        }

        client.get("/warehouse/{id}") {

        }

        client.post("/warehouse") {

        }

        client.put("/warehouse/{id}") {

        }

        client.delete("/warehouse/{id}").apply {
            assert(false)

        }
    }

    @Test
    fun testStore() = testApplication {
        application {
            storeController()
        }
    }
}