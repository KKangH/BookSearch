import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testSearch() {
        // 준비: 테스트할 도서 배열
        Book[] books = {
            new Book(1, "Book One", "Author One", 2001),
            new Book(2, "Book Two", "Author Two", 2002),
            new Book(3, "Book Three", "Author Three", 2003)
        };
        // 실행: 도서 배열을 가지고 있는 도서관 생성
        Library library = new Library(books);
        // 단언: search 메서드를 통해 도서를 찾고 비교
        assertEquals(books[1], library.search(2)); // id가 2인 책 검색
        assertNull(library.search(4)); // id가 4인 책 검색
    }

    @Test
    public void testSearchBs() {
        // 준비: 테스트할 도서 배열
        Book[] books = {
            new Book(1, "Book One", "Author One", 2001),
            new Book(2, "Book Two", "Author Two", 2002),
            new Book(3, "Book Three", "Author Three", 2003)
        };
        // 실행: 도서 배열을 가지고 있는 도서관 생성
        Library library = new Library(books);
        // 단언: search_bs 메서드를 통해 도서를 찾고 비교
        assertEquals(books[1], library.search_bs(2)); // id가 2인 책 검색
        assertNull(library.search_bs(4)); // id가 4인 책 검색
    }
}