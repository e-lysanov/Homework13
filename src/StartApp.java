public class StartApp {
    public static void main(String[] args) {

        Author jackLondon = new Author("Jack", "London");
        Book whiteFang = new Book("White Fang", jackLondon,1906);

        System.out.println("Название книги: " + whiteFang.getBookTitle());
        System.out.println("Имя автора: " + jackLondon.getNameOfAuthor());
        System.out.println("Фамилия автора: " + jackLondon.getSurnameOfAuthor());
        System.out.println("Год публикации книги: " + whiteFang.getPublicationYear());

        whiteFang.setPublicationYear(1907);
        System.out.println("Измененный год публикации книги: " + whiteFang.getPublicationYear());

        Author michaelBulgakov = new Author("Michael", "Bulgakov");
        Book masterAndMargarita = new Book("Master and Margarita", michaelBulgakov, 1967);
    }
}
