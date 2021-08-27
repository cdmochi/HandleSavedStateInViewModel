package com.cdpete.viewmodelsavedstatehandle

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.cdpete.viewmodelsavedstatehandle.data.Product
import com.cdpete.viewmodelsavedstatehandle.data.User

class MainViewModel(private val state: SavedStateHandle): ViewModel() {
    private var user: User?
    get() = state.get("user")
    set(value) = state.set("user", value)

    private var productLiveData: LiveData<List<Product>> =
        state.getLiveData("selected_products")

    private var productList : MutableList<Product>
    get() = state.get("selected_products") ?: mutableListOf()
    set(value) = state.set("selected_products", value)

    fun addSelectedProduct(product: Product) {
        val newProducts : MutableList<Product> = productList
        newProducts.add(product)
        productList = newProducts
    }
}