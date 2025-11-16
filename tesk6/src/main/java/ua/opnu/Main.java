package ua.opnu;

public class Main {
    public static void main(String[] args) {

        GenericTwoTuple<String, Integer> studentRating = new GenericTwoTuple<>("Костилєв Олександр", 95);
        System.out.println("TwoTuple: " + studentRating);
        System.out.println("Студент: " + studentRating.first + ", рейтинг: " + studentRating.second);

        GenericThreeTuple<String, Integer, String> studentRatingCourse =
                new GenericThreeTuple<>("Середа Олег", 88, "ООП");
        System.out.println("ThreeTuple: " + studentRatingCourse);
        System.out.println("Студент: " + studentRatingCourse.getFirst()
                + ", рейтинг: " + studentRatingCourse.getSecond()
                + ", курс: " + studentRatingCourse.third);

        GenericThreeTuple<Integer, Double, String> tuple2 =
                new GenericThreeTuple<>(123, 45.67, "Data");
        System.out.println("Example tuple2: " + tuple2);
    }
}
