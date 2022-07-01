package com.example

import com.example.repository.WarehouseRepository
import io.ktor.server.testing.*
import kotlin.test.*

class RepoTest {

    @Test
    fun testWarehouseRepo() = testApplication {
        application {
            WarehouseRepository()
        }


    }

}
