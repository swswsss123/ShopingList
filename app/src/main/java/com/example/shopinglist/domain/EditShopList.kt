package com.example.shopinglist.domain

class EditShopList(private val repositoryShop: RepositoryShop) {

    fun editShop(shopItem: shopItemModel){
        repositoryShop.editShop(shopItem)

    }
}