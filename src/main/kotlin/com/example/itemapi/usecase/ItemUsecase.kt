package com.example.itemapi.usecase

import com.example.itemapi.domain.Description
import com.example.itemapi.domain.Id
import com.example.itemapi.domain.Item
import com.example.itemapi.domain.Name
import com.example.itemapi.domain.Price
import com.example.itemapi.port.ItemPort
import org.springframework.stereotype.Component

@Component
class ItemUsecase(
    private val port: ItemPort
) {

    fun getItemById(id: Id): Item {
        return port.searchItem(id)
    }
}