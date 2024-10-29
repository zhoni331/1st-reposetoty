package part_2;

import part_2.UserView;
import part_2.UserViewModel;

public class UserApp {
    public static void main(String[] args) {
        UserViewModel viewModel = new UserViewModel();
        UserView view = new UserView(viewModel);
        view.displayMenu();
    }
}
