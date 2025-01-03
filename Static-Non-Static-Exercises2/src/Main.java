public class Main {
    public static void main(String[] args) {

//        Exercise 1

//        Player player1 = new Player("Adrian", 1000);
//        Player player2 = new Player("Florin", 2000);
//        Player player3 = new Player("Mihai", 3000);
//        Player player4 = new Player("Mircea", 4000);
//
//        Player player5 = new Player("Andrei", 6500);
//        Player player6 = new Player("Anton", 6000);
//
//        System.out.println(player1);
//        System.out.println(player2);
//        System.out.println(player3);
//        System.out.println(player4);
//        System.out.println(player5);
//        System.out.println(player6);

//        Exercise 2

//        Employee employee1 = new Employee("Adrian", 25);
//        Employee employee2 = new Employee("Florin", 22);
//        Employee employee3 = new Employee("Maria", 30);
//
//        employee1.sellProduct("Car");
//        employee1.sellProduct("Book");
//        employee1.sellProduct("Laptop");
//
//        employee2.sellProduct("Tv");
//        employee2.sellProduct("Playstation");
//        employee2.sellProduct("Table");
//
//        employee3.sellProduct("Keyboard");
//        employee3.sellProduct("PC");
//        employee3.sellProduct("Smartphone");
//        employee3.sellProduct("Smartphone");
//
//        System.out.println(employee1);
//        System.out.println(employee2);
//        System.out.println(employee3);
//
//        System.out.println(Employee.rang);

//        Exercise 3

//        Book book1 = new Book("Harry Potter 1", "J.K.Rowling");
//        Book book2 = new Book("Harry Potter 2", "J.K.Rowling");
//        Book book3 = new Book("Harry Potter 3", "J.K.Rowling");
//        Book book4 = new Book("Harry Potter 4", "J.K.Rowling");
//        Book book5 = new Book("Harry Potter 5", "J.K.Rowling");
//
//        book1.borrow();
//        book1.borrow();
//        book1.borrow();
//        book2.borrow();
//        book2.borrow();
//        book2.borrow();
//        book2.borrow();
//        book3.borrow();
//        book4.borrow();
//        book4.borrow();
//        book5.borrow();
//
//        System.out.println("The total number of students who borrowed books is :" + Book.totalStudents);

//        Exercise 4

        ChromeTab tab1 = new ChromeTab();
        ChromeTab tab2 = new ChromeTab();
        ChromeTab tab3 = new ChromeTab();
        ChromeTab tab4 = new ChromeTab();
        ChromeTab tab5 = new ChromeTab();

        tab1.changeCurrentSite("www.facebook.com");
        tab2.changeCurrentSite("www.youtube.com");
        tab1.changeCurrentSite("www.youtube.com");
        tab3.changeCurrentSite("www.linkedin.com");
        tab4.changeCurrentSite("www.google.com");
        tab5.changeCurrentSite("www.udemy.com");

        System.out.println("History: " + ChromeTab.history);

    }

//    1.We will create a video game. Create a Player class with the following properties: String name and int health.
//    Our game will support a maximum of 300 slots, and each generated player will occupy 50 slots.
//    When our game reaches the maximum capacity of players, a corresponding message will be displayed.

//     2. Create the class Employee, with the properties String name, int age, ArrayList<String> soldProducts and the method
//     sellProduct(String productName)
//     All employees work at the same company, which initially has a reputation rank of 500
//     Every time an employee sells a product, this product will be added to his list of sold products,
//     and the company's reputation will increase by 1.
//     Create 3 employees. Each employee will sell between 3 and 4 products.
//     Print out the status of each employee and the final reputation of the company.


//     3. Create the book class, with String name field, String authorName field and borrow() method.
//     Each time a book is borrowed, it will count and increment the total number of students who
//     have ever borrowed books.
//     Our library will contain 5 books.
//     Print the total number of students who have borrowed books from our library.

//     4. Create the ChromeTab class, with String field currentSiteName and method changeCurrentSite(String newSite),
//     which navigates our browser to a new site.
//     Our class will have a String history field, which will contain all sites accessed in all our tabs.
//     Open 4 chrome tabs, change the site 2/3 times in each, then print the history to the console
//     browser.

}
