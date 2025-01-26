package model.menuStructure;

import model.exceptions.ActionNumberNotFoundException;
import model.exceptions.NoActionException;
import model.menuServices.MenuInput;
import model.menuServices.MenuPrinter;
import model.menuStructure.menuActions.Actions.ExitAction;
import model.menuStructure.menuActions.Actions.FirstAction;
import model.menuStructure.menuActions.MenuActionsList;

public class MenuPanel {

    private final MenuActionsList menuActionsList = new MenuActionsList();
    {
        menuActionsList.addAction(new FirstAction());
        menuActionsList.addAction(new ExitAction());
    }

    public void displayMenu() {
        MenuPrinter.println("===================MENU===================");
        try {
            menuActionsList.getAllActionsInfo();
        } catch (NoActionException e) {
            MenuPrinter.println(e.getMessage());
        }
        MenuPrinter.println("___________________________________________");
        MenuPrinter.print("Select an option: ");
    }

    public void runMenuSelection() {
        int control = 0;
        do {
            displayMenu();
            control = MenuInput.input();
            actionSelected(control);
        } while (control != 0);
    }

    private void actionSelected(int control) {
        try {
            menuActionsList.callAction(control).execute();
        } catch (ActionNumberNotFoundException e) {
            MenuPrinter.println(e.getMessage());
        }
    }
}
