package com.example.itemapi.controller

import com.example.itemapi.domain.Id
import com.example.itemapi.domain.Item
import com.example.itemapi.usecase.ItemUsecase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ItemController(
    val usecase : ItemUsecase
) {

    @GetMapping("/ping")
    fun ping():String{
        return "pong"
    }

    @GetMapping("/items/{id}")
    fun getItem(@PathVariable("id") id:Int):ResponseItemJson{
        return usecase.getItemById(Id(id)).toResponseItemJson()
    }

    private fun Item.toResponseItemJson(): ResponseItemJson{
        // デメテル;;
        return ResponseItemJson(
            id = this.id.value,
            name = this.name.value,
            price = this.price.value,
            description = this.description.value
        )
    }

    data class ResponseItemJson(
        val id:Int,
        val name:String,
        val price:Int,
        val description:String
    )

}