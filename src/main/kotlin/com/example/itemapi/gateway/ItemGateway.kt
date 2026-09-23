package com.example.itemapi.gateway

import com.example.itemapi.domain.Id
import com.example.itemapi.domain.Item
import com.example.itemapi.driver.ItemDriver
import com.example.itemapi.port.ItemPort
import org.springframework.stereotype.Component

@Component
class ItemGateway (val driver : ItemDriver): ItemPort{

    override fun searchItem(id: Id): Item {
        return driver.searchItemById(id)
    }

}