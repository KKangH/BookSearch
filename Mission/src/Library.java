public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    // 기존 search 함수
    // 선형 탐색을 통해 주어진 id에 해당하는 책을 찾아 반환한다.
    public Book search(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    // 새로운 이진 탐색 함수
    // 주어진 id를 이진 탐색을 통해 찾아서 반환한다.
    // 배열 books가 정렬되어 있어야 올바르게 동작한다.
    public Book search_bs(int id) {
        int left = 0;
        int right = books.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (books[mid].getId() == id) {
                return books[mid];
            } else if (books[mid].getId() < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}