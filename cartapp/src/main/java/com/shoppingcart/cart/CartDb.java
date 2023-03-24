package com.shoppingcart.cart;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.shoppingcart.exception.CartNotFoundException;
import com.shoppingcart.exception.InvalidInputException;
import com.shoppingcart.item.Item;
import com.shoppingcart.item.ItemDb;
import com.shoppingcart.item.ItemsDb;
import com.shoppingcart.user.User;
import com.shoppingcart.user.UsersDb;


public class CartDb {
    static ArrayList <Integer> itemsinCart = new ArrayList<>();
    
    private static final ArrayList<Cart> carts = new ArrayList<>();

    public static void addCart(int cartId, int userId) {
        
        User user = UsersDb.findUserById(userId);

        Cart cart = new Cart();
        cart.setId(cartId);
        cart.setUser(user);
        carts.add(cart);
    }

    public static void addItemToCart( int itemId) {

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

    public static List<Cart> allCarts() {
        return carts;
    }

    public static List<Item> findItemsByCartId(int cartId) {
        return findCartById(cartId).getItems();
    }

    public static Cart findCartById(int cartId) {
        for( Cart cart : carts) {
            if(cart.getId() == cartId) {
                return cart;
            }
        }
        throw new CartNotFoundException("❌ Cart Id " + cartId +" Not Found");
    }
}