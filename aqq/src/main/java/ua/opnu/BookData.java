package ua.opnu;

//Task2
class BookData implements Comparable<BookData> {

    private String title;
    private String author;
    private int reviews;
    private double total;

    public double getRating() {
        return reviews == 0 ? 0.0 : total / reviews;
    }

    @Override
    public int compareTo(final BookData other) {
        int ratingCompare = Double.compare(other.getRating(), this.getRating());
        if (ratingCompare != 0) {
            return ratingCompare;
        }

        return this.title.compareTo(other.title);
    }
}
