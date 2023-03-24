package com.shoppingcart;

import com.shoppingcart.user.UserMenu;

/**
 * Hello world!
 */
public final class App {

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        UserMenu menu = new UserMenu();
        menu.performAction();
    }
}
