package com.example

import com.example.database.WarehouseEntity
import io.ktor.server.testing.*
import kotlin.test.Test

class EntityTest {

    @Test
    fun testWarehouseEntity() = testApplication {
        application {
            WarehouseEntity()
        }
    }
}