public class StartApp {
    public static void main(String[] args) {

        Author jackLondon = new Author("Джек", "Лондон");
        Book whiteFang = new Book("Белый Клык", jackLondon,1906);

        System.out.println("Название книги: " + whiteFang.getBookTitle());
        System.out.println("Имя автора: " + jackLondon.getNameOfAuthor());
        System.out.println("Фамилия автора: " + jackLondon.getSurnameOfAuthor());
        System.out.println("Год публикации книги: " + whiteFang.getPublicationYear());

//        System.out.println("Автор: " + whiteFang.getAuthor().toString());

//      использовал toString
        System.out.println("Автор " + jackLondon);
        System.out.println("whiteFang = " + whiteFang);


        whiteFang.setPublicationYear(1907);
        System.out.println("Измененный год публикации книги: " + whiteFang.getPublicationYear());

        Author michaelBulgakov = new Author("Михаил", "Булгаков");
        Book masterAndMargarita = new Book("Мастер и Маргарита", michaelBulgakov, 1967);

        //      сравню имена авторов
        if (jackLondon.equals(michaelBulgakov)) {
            System.out.println("Авторы тезки");
        } else {
            System.out.println("Имена авторов отличаются");
        }

        //      сравню названия произведений
        if (whiteFang.equals(masterAndMargarita)) {
            System.out.println("Названия книг совпали");
        } else {
            System.out.println("У книг разные названия");
        }

//      сравню произведения
        if (masterAndMargarita.hashCode() == whiteFang.hashCode()) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Книги разные");
        }

//      сравню авторов
        if (michaelBulgakov.hashCode() == jackLondon.hashCode()) {
            System.out.println("У этих книг один автор");
        } else {
            System.out.println("Книги написаны разными людьми");
        }
    }
}
