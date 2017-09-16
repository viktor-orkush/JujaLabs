package week5.laba25;

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
class Journal extends Issue {
    private String yearJournal;
    private String numberJournal;

    public Journal(String name, int countPages, String yearJournal, String numberJournal) {
        super(name, countPages);
        this.yearJournal = yearJournal;
        this.numberJournal = numberJournal;
    }

    public String toPrint(){
        String expectedJournalPrint = "Journal{name=TestNameJournal,countPages=100,year=TestYearJournal,number=TestNumberJournal}";
        //Journal{name=<name>,countPages=<countPages>,year=<yearJournal>,number=<numberJournal>}
        return "Journal{" + super.toPrint()  +
                        ",year=" + yearJournal + ",number=" + numberJournal + "}";
    }
}

class Main{
    public static void main(String[] args) {
        String testNameJournal = "TestNameJournal";
        String testYearJournal = "TestYearJournal";
        String testNumberJournal = "TestNumberJournal";
        int countPages = 100;
        System.out.println(new Journal(testNameJournal, countPages, testYearJournal, testNumberJournal));

    }
}
