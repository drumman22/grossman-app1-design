/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Jason Grossman
 */

package baseline;

import java.time.LocalDate;

public class Item {
    private String title;
    private String description;
    private Boolean isComplete;
    private LocalDate dueDate;

    Item(String title, String description, LocalDate dueDate) {
        // Default isComplete to false
    }

    Item(String title, String description, Boolean isComplete, LocalDate dueDate) {
        // Set values
    }

    public String getTitle() {
        // get title
        return ""; // temp return
    }

    public void setTitle(String title) {
        // set title
    }

    public String getDescription() {
        // get description
        return ""; // temp return
    }

    public void setDescription(String description) {
        // set description
    }

    public Boolean getComplete() {
        // get isComplete value
        return false; // temp return
    }

    public void setComplete(Boolean complete) {
        // set complete
    }

    public LocalDate getDueDate() {
        // get dueDate
        return LocalDate.now(); // temp return
    }

    public void setDueDate(LocalDate dueDate) {
        // set due date
    }

    public String getFormattedDueDate() {
        // format using DateTimeFormatter then return string
        return ""; // temp return
    }
}
