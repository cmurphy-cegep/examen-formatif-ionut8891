import java.util.ArrayList;
import java.util.List;

public class DocumentInvoker {
    private List<Action> actionHistory = new ArrayList<>();

    public void executeAction(Action action) {
        action.execute();
        actionHistory.add(action);
    }

    public void showHistory() {
        System.out.println("Action History:");
        for (Action action : actionHistory) {
            System.out.println(action.getClass().getName());
        }
    }
}
