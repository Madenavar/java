package com.xworkz.crud;

import java.util.Arrays;

public class Blinkit {


    private String[] itemNames = new String[10];

    // Create operation
    public void create(String dal, String rice, String s, String weat, String ragi, String jawar, String soyta, String oil, String washingPowder, String soap) {
        for (int i = 0; i < itemNames.length; i++) {
            if (itemNames[i] == null) {
                itemNames[i] = Arrays.toString(itemNames);

            }
        }
    }

    // Read operation
    public void read() {
        for (String itemName : itemNames) {
            if (itemName != null) {
                System.out.println(itemName);
            }
        }
    }

    // Update operation
    public void update(String name) {
        for (int i = 0; i < itemNames.length; i++) {
            if (itemNames[i] != null && itemNames[i].equals(name)) {
                String newName = null;
                itemNames[i] = newName;

            }
        }
    }

    // Delete operation
    public void delete(String itemName) {
        for (int i = 0; i < itemNames.length; i++) {
            if (itemNames[i] != null && itemNames[i].equals(itemName)) {
                itemNames[i] = null;
            }
        }
    }


    }


