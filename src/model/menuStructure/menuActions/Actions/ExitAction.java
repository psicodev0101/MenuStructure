package model.menuStructure.menuActions.Actions;


import model.menuServices.MenuPrinter;

public class ExitAction implements Action {


    public int menuActionNumber = 0;
    public String menuActionName = "Exit";

    @Override
    public int getNumber() {
        return menuActionNumber;
    }

    public void execute() {
        MenuPrinter.println("___________________________________________");
        MenuPrinter.println("See you later...");
    }

    @Override
    public String toString() {
        return "\n" + menuActionNumber + " " + menuActionName;
    }
}
