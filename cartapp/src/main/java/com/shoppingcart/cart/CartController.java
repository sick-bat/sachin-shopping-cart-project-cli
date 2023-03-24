package com.shoppingcart.cart;

import java.util.List;

import javax.management.RuntimeErrorException;

import java.util.ArrayList;

import com.shoppingcart.exception.InvalidInputException;
import com.shoppingcart.item.Item;
import com.shoppingcart.item.ItemsDb;

public class CartController {
 
    private int userId;
    ArrayList <Integer> itemsinCart = new ArrayList<>();

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void addItemToCart(int itemId) {
        // first find item in items db by its id
        // CartDb.addItemToCart( itemId);
        try{
        ItemsDb d1 = new ItemsDb();

        String item = d1.itemRetrieve(itemId);
        itemsinCart.add(itemId);
        System.out.println(item + "added to cart");
        }
        catch (IndexOutOfBoundsException e){
        System.out.println("Item not available");   
        // throw new InvalidInputException("Enter Numbers only");
    }
        catch(InvalidInputException e){
            System.out.println("Please Enter numbers only");
        }


    }

    // public List<Item> cartItems(int cartId) {
    //     return CartDb.findItemsByCartId(cartId);
    // }
     public void cartItems(int cartId){
        System.out.printf("| %-20s | %-20s | %-20s  |%n", "Item no.","ID", "NAME");
        System.out.printf("| %-20s | %-20s | %-10s  |%n", " ", " "," ");

        
        ItemsDb name = new ItemsDb();
        // for (int each =0;each<itemsinCart.size();each++ ){
        for (int each : itemsinCart){
            ////////////////////////////////////////////////////////////////////////////

  
                    // System.out.format("\n 👉 Id " + user.getId() + " Name " + user.getName());
                    // System.out.format( user.getId() +  user.getName());
            try{            
                int index = itemsinCart.indexOf(each);
            ///////////////////////////////////////////////////////////////////////////////
            System.out.printf("|%-20d | %-20d | %-10s  |%n ",index+1,each , name.itemRetrieve(each));}
                catch(IndexOutOfBoundsException e){
                    System.out.println("Item not available");

                }
        
        }
     }
     public int totalAmount(){
        int total = 0;

        ItemsDb price = new ItemsDb();
        for (Integer each : itemsinCart)
        {
            total = total + price.itemPrice(each);
        }
        return total;

     }
     public ArrayList removeItemsFromCArt(int index){
        ItemsDb name = new ItemsDb();
        System.out.println();
        itemsinCart.remove(index);
        return itemsinCart;

     }
}