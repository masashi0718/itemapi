package com.example.itemapi.usecase

import com.example.itemapi.domain.Description
import com.example.itemapi.domain.Id
import com.example.itemapi.domain.Item
import com.example.itemapi.domain.Name
import com.example.itemapi.domain.Price
import com.example.itemapi.port.ItemPort
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`
import kotlin.test.Test
import kotlin.test.assertEquals

private class ItemUsecaseTest {

    @Test
    fun アイテムをidから取得できる(){

        val port = mock(ItemPort::class.java)
        val searchId = Id(1)
        val expected = Item(
            id = Id(1),
            name = Name("テスト商品"),
            price = Price(1500),
            description = Description("これはテスト用の商品です")
        )
        `when`(port.searchItem(searchId)).thenReturn(expected)

        val sut = ItemUsecase(port)

        assertEquals(expected,sut.getItemById(Id(1)))
    }
}