/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Jason Grossman
 */

package baseline;

import java.util.List;

public class TodoList {
    private String title;
    private List<Item> itemList;

    public TodoList(String title) {
        // call other constructor with an empty list
    }

    public TodoList(String title, List<Item> itemList) {
        // set values
    }

    public void addItem(Item item) {
        // add item into itemList
    }

    public void updateItem(Item prevItem, Item newItem) {
        // update item by replacing the previous with the new
    }

    public void removeItem(Item item) {
        // remove item
    }

    public List<Item> getItemList() {
        // return itemList
        return null; // temp return
    }

    public List<Item> getComplete() {
        // create a new list
        // iterate through itemList
        // add items that are only completed (isComplete == true) to new list
        return null; // temp return
    }

    public List<Item> getIncomplete() {
        // create a new list
        // iterate through itemList
        // add items that are incomplete (isComplete == false) to new list
        return null; // temp return
    }

    public List<Item> getSortedByDate() {
        // sort list by due date
        return null; // temp return
    }

    public void setTitle(String title) {
        // set new title
    }

    public String getTitle() {
        // return title
        return ""; // temp return
    }

    public int getSize() {
        // get size of itemList
        return 0;
    }
}
