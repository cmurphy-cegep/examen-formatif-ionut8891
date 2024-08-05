public class DisplayAction implements Action {
    private Document document;

    public DisplayAction(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.display();
    }
}