package week5.laba26;

public class Test{
    public static void main(String[] args) {
        int countPages = 100;

        String testNameIssue = "TestNameIssue";

        String testNameBook = "TestNameBook";
        String testAuthorBook = "TestBookAuthor";

        String testNameJournal = "TestNameJournal";
        String testYearJournal = "TestYearJournal";
        String testNumberJournal = "TestNumberJournal";


        String expectedPrintCatalog = "Issue{name=TestNameIssue,countPages=100}" +
                "Book{name=TestNameBook,countPages=100,author=TestBookAuthor}" +
                "Journal{name=TestNameJournal,countPages=100,year=TestYearJournal,number=TestNumberJournal}";

        Library library = new Library();

        Issue[] arrayIssue = new Issue[3];

        arrayIssue[0] = new Issue(testNameIssue, countPages);
        arrayIssue[1] = new Book(testNameBook, countPages, testAuthorBook);
        arrayIssue[2] = new Journal(testNameJournal, countPages, testYearJournal, testNumberJournal);

        String actualPrintCatalog = library.printCatalog(arrayIssue);

        //check
        if (actualPrintCatalog == null)
            throw new AssertionError("Result cannot be null");

        if (actualPrintCatalog.equals(expectedPrintCatalog))
            System.out.print("OK");
        else
            throw new AssertionError("Expected " + expectedPrintCatalog + " but found " + actualPrintCatalog);


    }

}