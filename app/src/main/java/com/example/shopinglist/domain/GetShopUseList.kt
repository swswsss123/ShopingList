package com.example.shopinglist.domain

class GetShopUseList(private val repositoryShop: RepositoryShop) {

    fun getShopList():List<shopItemModel>{
        return repositoryShop.getShopList()
    }
}