interface Printable {
    void print();
}

interface Saveable {
    void save();
}

// A class implementing MULTIPLE interfaces
class Document implements Printable, Saveable {
    private String title;

    Document(String title) { this.title = title; }

    public void print() {
        System.out.println("Printing document: " + title);
    }
    public void save() {
        System.out.println("Saving document: " + title);
    }
}

public class MultiInterfaceDemo {
    public static void main(String[] args) {
        Document doc = new Document("OOP Assignment");
        doc.print();
        doc.save();

        // Interface reference (polymorphism)
        Printable p = doc;
        p.print();
    }
}
