package com.example.shopinglist.data

import com.example.shopinglist.domain.RepositoryShop
import com.example.shopinglist.domain.shopItemModel
//Щбджект по сути синглтон, откуда бы мы не обратились к обьекту мы получим одни и теже даные
object RepositoryShopItImpl:RepositoryShop {
    override fun addShop(shopItem: shopItemModel) {
        TODO("Not yet implemented")
    }

    override fun deleteShop(shopItem: shopItemModel) {
        TODO("Not yet implemented")
    }

    override fun editShop(shopItem: shopItemModel) {
        TODO("Not yet implemented")
    }

    override fun getId(id: Int): shopItemModel {
        TODO("Not yet implemented")
    }

    override fun getShopList(): List<shopItemModel> {
        TODO("Not yet implemented")
    }
}