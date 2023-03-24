package com.shoppingcart.item;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.shoppingcart.exception.ItemNotFoundException;

public class ItemDb {
    private final static ArrayList<Item> items = new ArrayList<>();

    public static void addItem(int id, String name, double price) {
        Item item = new Item(id, name, price);
        items.add(item);
    }

    public static List<Item> listItems() {
        return items;
    }

    public static Item findItemById(int itemId) {

        for( Item item : items) {
            if(item.getId() == itemId) {
                return item;
            }
        }

    // public static int itemsPrice(itemid){
    //     String csvFile = "CartApp/Data/ItemsDb.csv";
    //     String line = "";
    //     String csvSplitBy = ",";
    //     int totalsum =0;
    //     List<String[]> rows = new ArrayList<>();

    //     try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

    //         // Read the CSV file into a list of string arrays
    //         while ((line = br.readLine()) != null) {
    //             String[] data = line.split(csvSplitBy);
    //             rows.add(data);
    //         }

    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }

    //     // Read a particular cell from the CSV file
    //     int rowIndex = 2; // row index (zero-based)
    //     int columnIndex = 2; // column index (zero-based)
    //     String cellValue = rows.get(rowIndex)[columnIndex];

    //     // Print the value of the cell
    //     System.out.println("The value of cell (" + rowIndex + ", " + columnIndex + ") is: " + cellValue);
    //     totalsum = Integer.parseInt(rows.get(2)[2])  + Integer.parseInt(rows.get(3)[2]);
    //     System.out.println(totalsum);
        
    // }

        throw new ItemNotFoundException("❌ Item Id " + itemId  +" Not Found");
    }
}