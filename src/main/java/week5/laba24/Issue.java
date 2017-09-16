package week5.laba24;

public class Issue {
    private String name;
    private int countPages;

    public Issue(String name, int countPages) {
        this.name = name;
        this.countPages = countPages;
    }

    public String toPrint() {
        return "name=" + name +
                ",countPages=" + countPages;
    }
}

class Book extends Issue {
    private String authorBook;

    public Book(String name, int countPages, String authorBook) {
        super(name, countPages);
        this.authorBook = authorBook;
    }

    public String toPrint(){
        //Book{name=<name>,countPages=<countPages>,author=<authorBook>}
        return "Book{" + super.toPrint() +",author=" +authorBook + "}";
    }
}