public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Сапковский", "Анджей");
        Author author2 = new Author("Ник", "Перумов");

        Book book1 = new Book("Ведьмак", author1, 2000);
        Book book2 = new Book("Дочь некроманта", author2, 2003);

        book1.setYearPublication(1998);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(author2.equals(author2));
        System.out.println(book2.equals(book2));
        System.out.println(author1.hashCode());
        System.out.println(book2.hashCode());


    }
}