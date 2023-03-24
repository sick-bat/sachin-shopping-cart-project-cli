package com.shoppingcart.user;



public class UserController {

    public void createNewUser(int id, String name) {
        int sts = UsersDb.addNewUser(id, name);
        if (sts == UsersDb.NO_MORE_SPACE) {
            System.out.println("\n ❌ There is no more space ");
        } else if (sts == UsersDb.USER_ALREADY_EXISTS) {
            System.out.println("\n ❌ User Already Exists ");
        } else {
            System.out.println("\n ✅ User Successfully Created ");
        }
        System.out.println("\n\n\n");
    }

    public void listAllUsers() {
        // System.out.format("+------------+-------+---------+\n");
        System.out.printf("| %-10s | %-8s |%n", "ID", "NAME");
        System.out.printf("| %-10s | %-8s  |%n", " ", " ");


        User[] users = UsersDb.listUsers();
        for (User user : users) {
            if (user != null) {
                // System.out.format("\n 👉 Id " + user.getId() + " Name " + user.getName());
                // System.out.format( user.getId() +  user.getName());
                System.out.printf("| %-10s | %-8s  |%n", user.getId() ,  user.getName());
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }

                // System.out.format("+------------+-------+---------+\n");
            }
        }
        System.out.println("\n\n\n");
    }

    public double totalCartPrice() {
        return 0;
    }
}