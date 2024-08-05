
public class Document {
    private String content;

    public void create(String content) {
        this.content = content;
        System.out.println("Document created with content: " + content);
    }

    public void delete() {
        content = null;
        System.out.println("Document deleted.");
    }

    public void display() {
        if (content != null) {
            System.out.println("Document content: " + content);
        } else {
            System.out.println("Document is empty.");
        }
    }
}
