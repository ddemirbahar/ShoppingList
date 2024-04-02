package com.example.kotdev
import java.util.Scanner


open class Item (val name: String, val price: Double)

class Food (name: String, price: Double, val weight: String) : Item (name, price)

class Cloth (name: String, price: Double, val type: String) : Item (name, price)


class ShoppingList {
    private val itemList = mutableListOf<Item>()

    fun addItem (scanner: Scanner){

    }
    fun displayItems() {

    }
    fun deleteItem(scanner: Scanner){

    }
    fun main (){
        val scanner = Scanner(System.`in`)
        val shoppingList = ShoppingList()

        var option: Int
        do {
            println("\n Menu:")
            println("1) Add Item")
            println("2) Display Item")
            println("3) Delete Item")
            println("4) Exit")
            print ("Select an option:")
            option = scanner.nextInt()

            when (option){
                1-> shoppingList.addItem(scanner)
                2-> shoppingList.displayItems()
                3-> shoppingList.deleteItem(scanner)
                4-> println("Exiting")
                else -> println("Invalid option! Please select a valid option.")
            }

        } while (option !=4)
        scanner.close()
    }
}