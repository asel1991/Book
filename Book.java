public class Book {

    private String title;
    private String author;
    private String ISBN;
    private double price;


    public Book() {
        this.title = "";
        this.author = "";
        this.ISBN = "";
        this.price = 0.0;
    }


    public Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }


    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Цена: $" + price);
    }


    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }


    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("1984", "Джордж Оруэлл", "123456789", 15.99);
        Book book3 = new Book("Убить пересмешника", "Харпер Ли", "987654321", 10.99);
        

        book1.displayInfo();
        System.out.println();
        book2.displayInfo();
        System.out.println();
        book3.displayInfo();
        

        book2.applyDiscount(10); 
        System.out.println("\nПосле скидки:");
        book2.displayInfo();
    }
}
