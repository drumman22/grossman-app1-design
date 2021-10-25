/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Jason Grossman
 */

package baseline;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;

public class ItemListController {

    private SceneSwitcher sceneSwitcher;
    private TodoList todoList;

    // Table view variables
    @FXML
    private TableView itemsTableView;
    @FXML
    private TableColumn titleColumn;
    @FXML
    private TableColumn dueDateColumn;
    @FXML
    private TableColumn statusColumn;

    // Item view/information
    @FXML
    private TextField titleTextField;
    @FXML
    private TextArea descriptionTextArea;
    @FXML
    private DatePicker dueDatePicker;
    @FXML
    private Checkbox isCompleteCheckBox;

    public void initalizeScene(TodoList todoList) {
        // make todolist on self
        // run updateTableView
        // run updateItemView with first item (if any)
    }

    public void updateTableView() {
        // used to update the table view
    }

    public void updateItemView(Item item) {
        // used to update Item information for viewing
    }

    @FXML
    public void addItem() {
        // add item to todolist
        // updateTableView()
    }

    @FXML
    public void removeSelectedItem() {
        // remove item from todolist
        // updateTableView()
    }

    @FXML
    public void updateSelectedItem() {
        // update item from todolist
        // updateTableView()
    }

    @FXML
    public void onItemSelection() {
        // updateItemView() with selected item
    }
}
