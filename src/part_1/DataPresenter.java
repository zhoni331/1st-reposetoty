package part_1;

public class DataPresenter {
    private DataModel model;
    private ConsoleView view;

    public DataPresenter(DataModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void showData() {
        String data = model.getData();
        view.displayData(data);
    }

    public void updateData(String newData) {
        model.setData(newData);
    }

    public void appendData(String moreData) {
        model.appendData(moreData);
    }
}
