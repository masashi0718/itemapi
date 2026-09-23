package com.example.itemapi.driver

import com.example.itemapi.domain.Description
import com.example.itemapi.domain.Id
import com.example.itemapi.domain.Item
import com.example.itemapi.domain.Name
import com.example.itemapi.domain.Price
import org.springframework.stereotype.Component

@Component
class ItemDriver {

    val items = mutableListOf<Item>(
        Item(
            id = Id(1),
            name = Name("米"),
            price = Price(1000),
            description = Description("一番美味しいお米")
            ),
        Item(
            id = Id(2),
            name = Name("パン"),
            price = Price(1500),
            description = Description("一番美味しいパン")
        )
    )

    fun searchItemById(id: Id): Item {
           return items.find{ it.id == id }?:throw IllegalArgumentException("User Not Found $id")
    }
}