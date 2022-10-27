import java.util.Objects;

public class Book {
    private final String titleOfTheBook;
    private final Author Author;
    private int yearOfPublication;

    public Book(String titleOfTheBook, int yearOfPublication, Author nameAuthor) {
        this.titleOfTheBook = titleOfTheBook;
        this.yearOfPublication = yearOfPublication;
        this.Author = nameAuthor;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Название книги -" + titleOfTheBook + Author.toString() + ", Дата издательства - " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(titleOfTheBook, book.titleOfTheBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleOfTheBook, yearOfPublication);
    }
}
