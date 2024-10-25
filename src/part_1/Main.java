package part_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create instances
        DataModel model = new DataModel();
        ConsoleView view = new ConsoleView();
        DataPresenter presenter = new DataPresenter(model, view);

        // Gather input for the initial data
        String initialData = view.gatherInput();
        presenter.updateData(initialData);

        // Display the data
        presenter.showData();

        // Append more data
        String moreData = view.gatherAppendInput();
        presenter.appendData(moreData);

        // Display the updated data
        presenter.showData();
    }
}

/*
1. Separate the Model, View, and Presenter into different classes.

2. Ensure that the Presenter acts as the intermediary between the Model and the View.

3. Make the Model responsible for managing the data, the View responsible for displaying and gathering user input,
and the Presenter for coordinating between them.
*/