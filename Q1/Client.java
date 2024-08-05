
public class Client {
    public static void main(String[] args) {
        Document document = new Document();

        Action createAction = new CreateAction(document, "Hello, World!");
        Action displayAction = new DisplayAction(document);
        Action deleteAction = new DeleteAction(document);

        DocumentInvoker invoker = new DocumentInvoker();

        invoker.executeAction(createAction);
        invoker.executeAction(displayAction);
        invoker.executeAction(deleteAction);
        invoker.executeAction(displayAction);

        invoker.showHistory();
    }
}
