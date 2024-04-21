public class Book {
    private String title;
    private Author author;
    private int yearPublication;

    public Book(String title, Author author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString(){
        return "Название: " + title + ". Год выпуска: " + yearPublication + "г. Автор " + author.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        Book book = (Book) object;
        return title.equals(book.title) && yearPublication == book.yearPublication && author.equals(book.author);
    }

    @Override
    public int hashCode(){
        return java.util.Objects.hash(title, yearPublication, author);
    }
}
