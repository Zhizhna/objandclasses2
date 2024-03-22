import java.util.Objects;
class Book {
    private String title;
    private int yearOfPublication;

    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return yearOfPublication == book.yearOfPublication &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,yearOfPublication);
    }

    public String toString() {
        return "The book " + getTitle() + " written in " + getYearOfPublication();
    }
}
