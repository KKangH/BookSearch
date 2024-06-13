import java.util.ArrayList;
import java.util.List;

// Book 클래스 정의
public class Book {
    // 멤버 변수 선언
    private int id;                 // 책의 ID
    private String title;           // 책의 제목
    private String author;          // 책의 저자
    private int publicationYear;    // 책의 출판년도
    private static List<Book> bookCollection = new ArrayList<>();  // 책들의 컬렉션을 저장하는 리스트

    // 생성자 - 책의 정보를 초기화하는 메서드
    public Book(int id, String title, String author, int publicationYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Getter 메서드들 - 책의 정보를 가져오는 메서드들
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // 책을 추가하는 메서드
    public static boolean addBook(Book book) {
        for (Book b : bookCollection) {
            // 이미 같은 ID의 책이 존재하는 경우 추가하지 않음
            if (b.getId() == book.getId()) {
                System.out.println("해당 ID(" + book.getId() + ")는 이미 존재합니다.");
                return false;
            }
        }
        bookCollection.add(book);   // 리스트에 책 추가
        System.out.println(book + " 도서가 추가되었습니다.");
        return true;
    }

    // 책을 제거하는 메서드
    public static boolean removeBook(int id) {
        for (Book b : bookCollection) {
            // 해당 ID를 가진 책을 찾아서 리스트에서 제거
            if (b.getId() == id) {
                bookCollection.remove(b);
                System.out.println(b + " 도서를 삭제하였습니다.");
                return true;
            }
        }
        System.out.println("해당 ID(" + id + ")의 도서를 찾을 수 없습니다.");
        return false;
    }

    // 제목으로 책을 검색하는 메서드
    public static Book searchBook(String title) {
        for (Book b : bookCollection) {
            // 제목이 일치하는 책을 찾아서 반환
            if (b.getTitle().equals(title)) {
                System.out.println("검색 결과:\n" + b);
                return b;
            }
        }
        System.out.println("검색된 도서가 없습니다.");
        return null;
    }

    // 책 컬렉션을 초기화하는 메서드
    public static void clearBookCollection() {
        bookCollection.clear();
    }

    // 객체를 문자열로 표현하는 메서드
    @Override
    public String toString() {
        return "Book{id: '" + id + "', 제목: '" + title + "', 저자: '" + author + "', 출판년도: " + publicationYear + "}";
    }
}
