package ua.opnu;

public class Main {
    public static void main(String[] args) {

        // Тестування MyOptional
        System.out.println("=== MyOptional test ===");
        MyOptional<String> middleName = new MyOptional<>();
        System.out.println(middleName);
        System.out.println("isPresent: " + middleName.isPresent());
        System.out.println("orElse: " + middleName.orElse("немає"));

        MyOptional<String> username = new MyOptional<>("admin");
        System.out.println(username);
        System.out.println("isPresent: " + username.isPresent());
        System.out.println("get(): " + username.get());
        System.out.println("orElse: " + username.orElse("guest"));

        try {
            String test = middleName.get();
            System.out.println("unexpected: " + test);
        } catch (IllegalStateException ex) {
            System.out.println("Очікуваний виняток: " + ex.getMessage());
        }

        try {
            MyOptional<String> broken = new MyOptional<>(null);
            System.out.println("unexpected: " + broken);
        } catch (IllegalArgumentException ex) {
            System.out.println("Правильно не дозволив null: " + ex.getMessage());
        }

        // Тестування узагальненого класу Printer для друку масивів будь-якого типу
        System.out.println("\n=== Printer test ===");
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);

        // Тестування узагальнених кортежів (tuple) - структур даних, що зберігають кілька значень різних типів
        System.out.println("=== Generic Tuple test ===");
        GenericTwoTuple<String, Integer> studentRating = new GenericTwoTuple<>("Костилєв Олександр", 95);
        System.out.println("TwoTuple: " + studentRating);
        System.out.println("Студент: " + studentRating.first + ", рейтинг: "
                + studentRating.second);

        GenericThreeTuple<String, Integer, String> studentRatingCourse =
                new GenericThreeTuple<>("Середа Олег", 88, "ООП");
        System.out.println("ThreeTuple: " + studentRatingCourse);
        System.out.println("Студент: " + studentRatingCourse.getFirst()
                + ", рейтинг: " + studentRatingCourse.getSecond()
                + ", курс: " + studentRatingCourse.third);

        GenericThreeTuple<Integer, Double, String> tuple2 =
                new GenericThreeTuple<>(123, 45.67, "Data");
        System.out.println("Example tuple2: " + tuple2);

        // Тестування узагальненого методу пошуку елемента в масиві
        System.out.println("\n== Task5 test ==");
        String[] words = {"apple", "banana", "cat"};
        System.out.println(Task5.contains(words, "banana"));

        Integer[] nums = {1, 2, 3};
        System.out.println(Task5.contains(nums, 2));
    }
}