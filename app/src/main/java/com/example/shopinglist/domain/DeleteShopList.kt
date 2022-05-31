package com.example.shopinglist.domain

class DeleteShopList(private val repositoryShop: RepositoryShop) {

    fun deleteShop(shopItem: shopItemModel){
        repositoryShop.deleteShop(shopItem)
    }
}