public class Book {

    String name;
    String author;
    int totalPageNumber;
    int currentPageNumber;

    public Book(String name, String author, int totalPageNumber) {
        this.name = name;
        this.author = author;
        this.totalPageNumber = totalPageNumber;
        currentPageNumber = 1;
    }

    public void flipPageForward(){
        if(currentPageNumber == totalPageNumber){
            System.out.println("No pages to flip");
        }else{
            currentPageNumber++;
            System.out.println("We flip to page " + currentPageNumber);
        }
    }

    public void flipPageBackwards(){
        if(currentPageNumber == 1){
            System.out.println("We are already on the first page");
        }else{
            currentPageNumber--;
            System.out.println("We flip to page " + currentPageNumber);
        }

    }

    public void printBookState(){
        System.out.println("The book " + name + " written by " + author + " having " + totalPageNumber + " pages is open on page "
        + currentPageNumber);

    }
}
