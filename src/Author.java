public class Author {
    private String nameOfAuthor;
    private String surnameOfAuthor;

    public Author(String nameOfAuthor, String surnameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
        this.surnameOfAuthor = surnameOfAuthor;
    }

    public String getNameOfAuthor() {
        return this.nameOfAuthor;
    }

    public String getSurnameOfAuthor() {
        return this.surnameOfAuthor;
    }
}
