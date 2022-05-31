package com.example.shopinglist.domain

class AddShopList(private val repositoryShop: RepositoryShop) {

    fun addShop(shopItem: shopItemModel){
        repositoryShop.addShop(shopItem)
    }
}