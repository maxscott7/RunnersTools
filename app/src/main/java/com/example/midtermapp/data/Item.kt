package com.example.midtermapp.data

import java.io.Serializable

data class Item(val itemName: String, var detailItems: MutableList<String>) : Serializable