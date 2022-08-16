public class Printer {
    public String queue = "";
    private int pagesInQueue  = 0;

    private int pagesCount = 0;
    private int printedPages = 0;
    private String text = "";

    public void append(String text, 
                       int pagesCount) {
        queue = queue + "\n" + name + " - " + text;
        pagesInQueue = pagesInQueue + pagesCount;

    }

    public void append(String text, String name,
                       int pagesCount) {
        queue = queue + "\n" + name + " - " + text;
        pagesInQueue = pagesInQueue + pagesCount;

    }

    public void append(String text, String name) {
        append(text, name, 1);

    }

    public void append(String text, int pagesCount) {

        queue = queue + "\n" + "Äîêóìåíò áåç èìåíè" + " - " + text;
        pagesInQueue = pagesInQueue + pagesCount;
    }

    public void append(String text) {
        append(text, 1);
    }

    public void clear (){
        queue = "NEW VALUE";
        pagesInQueue = 0;
    }

    public int getPendingPagesCount (){
        return  pagesInQueue ;
    }
    public void print (){
        printedPages = printedPages + pagesInQueue;
        System.out.println(queue);

         clear();
    }

    public int getPrintedPagesCount() {
        return printedPages;
    }
}
