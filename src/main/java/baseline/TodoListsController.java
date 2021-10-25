package baseline;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class TodoListsController implements Initializable {

    private SceneSwitcher sceneSwitcher;
    private List<TodoList> todoLists;

    private Stage stage;
    private Scene scene;
    private Parent root;

    // Table view variables
    @FXML
    private TableView todoTableView;
    @FXML
    private TableColumn titleColumn;
    @FXML
    private TableColumn itemAmountColumn;
    @FXML
    private TableColumn completedAmountColumn;
    @FXML
    private TableColumn incompletedAmountColumnlumn;

    // Item view/information
    @FXML
    private TextField listTitleTextField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // initialize loading todolists
    }

    public void loadTodoLists() {
        // load todolists file
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
