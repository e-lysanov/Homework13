import java.util.Objects;

public class Author {
    private String nameOfAuthor;
    private String surnameOfAuthor;

    public Author(String nameOfAuthor, String surnameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
        this.surnameOfAuthor = surnameOfAuthor;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public String getSurnameOfAuthor() {
        return surnameOfAuthor;
    }

    @Override
    public String toString() {
        return nameOfAuthor + " " + surnameOfAuthor;
    }

// здесь генерировал методы-шаблоны
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
//        сравниваю только имена
        return Objects.equals(nameOfAuthor, author.nameOfAuthor);
//        если бы хотел сравнить и фамилии то:
//        && Objects.equals(surnameOfAuthor, author.surnameOfAuthor)
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfAuthor, surnameOfAuthor);
    }
}
