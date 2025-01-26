package model.menuStructure.menuActions;

import model.exceptions.ActionNumberNotFoundException;
import model.exceptions.NoActionException;
import model.menuStructure.menuActions.Actions.Action;

import java.util.ArrayList;
import java.util.List;

public class MenuActionsList {

    public final List<Action> actionsList;

    public MenuActionsList() {
        actionsList = new ArrayList<>();
    }

    public void addAction(Action action) {
        actionsList.add(action);
    }

    public Action callAction(int menuActionNumber) throws ActionNumberNotFoundException {
        Action action = searchAction(menuActionNumber);
        if (action == null) {
            throw new ActionNumberNotFoundException("ERROR: Action not found");
        }
        return action;
    }

    private Action searchAction (int menuActionNumber) {
        for (Action action : actionsList) {
            if (action.getNumber() == menuActionNumber) {
                return action;
            }
        }
        return null;
    }

    public void getAllActionsInfo() throws NoActionException {
        if (this.actionsList.isEmpty()) {
            throw new NoActionException("ERROR: Actions list is empty");
        }
        for(Action action : actionsList) {
            System.out.println(action.toString());
        }
    }

}
