public class CreateAction implements Action {
    private Document document;
    private String content;

    public CreateAction(Document document, String content) {
        this.document = document;
        this.content = content;
    }

    @Override
    public void execute() {
        document.create(content);
    }
}
