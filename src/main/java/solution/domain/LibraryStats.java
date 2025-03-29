package solution.domain;

import java.util.Set;

public class LibraryStats {
    private int totalBooks;
    private int totalAuthors;

    public void incrementBooks() {
        totalBooks++;
    }

    public void incrementAuthors() {
        totalAuthors++;
    }

    // геттеры
    public int getTotalBooks() {
        return totalBooks;
    }

    public int getTotalAuthors() {
        return totalAuthors;
    }
}
