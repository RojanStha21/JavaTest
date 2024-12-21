package S3Workshop_4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class W4Task11 {
    private List<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    public List<String> searchBooksByTitle(String title) {
        List<String> result = new ArrayList<>();
        for (String book : books) {
            if (book.contains(title)) {
                result.add(book);
            }
        }
        return result;
    }
}

class LibraryServiceTest {

    private W4Task11 libraryService;

    @BeforeAll
    static void setupClass() {
        System.out.println("Setting up global configuration...");
    }

    @AfterAll
    static void tearDownClass() {
        System.out.println("Cleaning up resources...");
    }

    @BeforeEach
    void setup() {
        libraryService = new W4Task11();
        System.out.println("Initializing LibraryService instance...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Resetting state after test...");
    }

    @Test
    void testAddBook() {
        libraryService.addBook("Harry Potter");
        assertEquals(1, libraryService.searchBooksByTitle("Harry").size());
    }

    @Test
    void testSearchBooksByTitle() {
        libraryService.addBook("Harry Potter");
        libraryService.addBook("The Hobbit");
        List<String> result = libraryService.searchBooksByTitle("Harry");
        assertTrue(result.contains("Harry Potter"));
        assertEquals(1, result.size());
    }
}
