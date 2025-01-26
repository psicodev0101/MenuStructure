package model.menuStructure.menuActions.Actions;


import model.menuServices.MenuPrinter;

public class FirstAction implements Action {


    public int menuActionNumber = 1;
    public String menuActionName = "First Action";

    @Override
    public int getNumber() {
        return menuActionNumber;
    }

    public void execute() {
        MenuPrinter.println("___________________________________________");
        MenuPrinter.println("First Action is executed");
    }

    @Override
    public String toString() {
        return menuActionNumber + " " + menuActionName;
    }
}
