package com.example.repository

import com.example.model.DBHelper
import com.example.model.Store
import com.example.model.StoreDraft

class StoreRepository {

    val database = DBHelper()

    fun getAllStores(): List<Store> {
        TODO()
    }

    fun getSpecificStore(id: Int): Store? {
        TODO()
    }

    fun addStore(draft: StoreDraft): Store {
        TODO()
    }

    fun updateStore(id: Int, draft: StoreDraft): Boolean {
        TODO()
    }

    fun deleteStore(id: Int): Boolean {
        TODO()
    }

}