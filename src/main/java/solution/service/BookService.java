package solution.service;

import org.springframework.stereotype.Service;
import solution.domain.Book;
import solution.domain.LibraryStats;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class BookService {
    private List<Book> books = new ArrayList<>();
    private Set<String> authors = new HashSet<>();
    private final LibraryStats libraryStats;

    public BookService(LibraryStats libraryStats) {
        this.libraryStats = libraryStats;
    }

    public Book addBook(Book book) {
        book.setId((long) (books.size() + 1));
        books.add(book);
        libraryStats.incrementBooks();
        if(!authors.contains(book.getAuthor())) {
            libraryStats.incrementAuthors();
            authors.add(book.getAuthor());

        }
        return book;
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public LibraryStats getLibraryStats() {
        return libraryStats;
    }
}

