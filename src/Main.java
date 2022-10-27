public class Main {
    public Main()  {
    }

    public static void main(String[] args) {
        Author bulgakov = new Author(" Михаил", " Булгаков");
        Book theMasterAndMargarita = new Book(" Мастер и Маргарита", 1967, bulgakov);

        System.out.println(theMasterAndMargarita);

        Author turgenev = new Author(" Иван", " Тургенев");
        Book fathersAndSons = new Book(" Отцы и Дети", 1880, turgenev);
        fathersAndSons.setYearOfPublication(1862);

        System.out.println(fathersAndSons);

        System.out.println("Совпадения по автору");
        System.out.println(bulgakov.equals(turgenev));
        System.out.println("Cовпадения по названию книг");
        System.out.println(theMasterAndMargarita.equals(fathersAndSons));

    }
}