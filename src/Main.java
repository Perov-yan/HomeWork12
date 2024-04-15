public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Сапковский", "Анджей");
        Author author2 = new Author("Ник", "Перумов");
        Book book1 = new Book("Ведьмак", author1, 2000);
        Book book2 = new Book("Дочь некроманта", author2, 2003);

        book1.setYearPublication(1998);
        System.out.println(book1.getTitle() + " написал " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", опубликована " + book1.getYearPublication());
        System.out.println(book2.getTitle() + " написал " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", опубликована " + book2.getYearPublication());
    }
}