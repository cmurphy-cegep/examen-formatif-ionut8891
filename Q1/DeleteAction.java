public class DeleteAction implements Action {
    private Document document;

    public DeleteAction(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.delete();
    }
}