package com.example.shopinglist.domain

class GetShopId(private val repositoryShop: RepositoryShop) {

    fun getId(id:Int):shopItemModel{
        return repositoryShop.getId(id)
    }
}