public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Alfred", "Bester");
        Author author2 = new Author("Henrik", "Böll");
        Book book1 = new Book("Tiger Tiger", author1, 1000);
        Book book2 = new Book("Stranger", author2, 1942);
        book1.setYearOfPublication(1989);
        System.out.print(book1);
        System.out.println(author1);
        System.out.print(book2);
        System.out.println(author2);
    }
}