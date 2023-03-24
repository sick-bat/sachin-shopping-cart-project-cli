package com.shoppingcart.item;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ItemsDb {

    public String itemRetrieve(int itemId){

        String csvFile = "CartApp/data/ItemsDb.csv";
        String line = "";
        String csvSplitBy = ",";
        int totalsum =0;
        List<String[]> rows = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {


            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                rows.add(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        int rowIndex = itemId;
        int columnIndex = 1;
        String cellValue = rows.get(rowIndex)[columnIndex];


        // System.out.println("The value of cell (" + rowIndex + ", " + columnIndex + ") is: " + cellValue);
        // totalsum = Integer.parseInt(rows.get(2)[2])  + Integer.parseInt(rows.get(3)[2]);
        // System.out.println(totalsum);
        return cellValue;
    }


    public int itemPrice(int itemId) {
        String csvFile = "CartApp/data/ItemsDb.csv";
        String line = "";
        String csvSplitBy = ",";
        // int totalsum =0;
        List<String[]> rows = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {


            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                rows.add(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        

        int rowIndex = itemId;
        int columnIndex = 2;
        String cellValue = rows.get(rowIndex)[columnIndex];


        // System.out.println("The value of cell (" + rowIndex + ", " + columnIndex + ") is: " + cellValue);
        // totalsum = Integer.parseInt(rows.get(2)[2])  + Integer.parseInt(rows.get(3)[2]);
        // System.out.println(totalsum);
        return Integer.parseInt(cellValue);
    }
}