public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Joe", 15, 50.0);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Bob", 2, 1.0);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
