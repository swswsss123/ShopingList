package com.example.shopinglist.domain

interface RepositoryShop {

    fun addShop(shopItem: shopItemModel)

    fun deleteShop(shopItem: shopItemModel)

    fun editShop(shopItem: shopItemModel)

    fun getId(id:Int):shopItemModel

    fun getShopList():List<shopItemModel>

}