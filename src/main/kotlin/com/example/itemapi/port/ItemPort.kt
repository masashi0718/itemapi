package com.example.itemapi.port

import com.example.itemapi.domain.Id
import com.example.itemapi.domain.Item
import org.springframework.stereotype.Component

@Component
interface  ItemPort {
    fun searchItem(id: Id) : Item
}