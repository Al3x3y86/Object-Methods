import java.util.Objects;

public class Author  {
    private final String firstname;
    private final String lastname;

    public Author(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return " Автор книги -" + firstname + " "+ lastname ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstname, author.firstname) && Objects.equals(lastname, author.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }
}