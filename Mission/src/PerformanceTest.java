public class PerformanceTest {
    public static void main(String[] args) {
        Book[] books = new Book[1000000];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book(i, "Book " + i, "Author " + i, 2000 + i);
        }
        Library library = new Library(books);

        long startTime = System.nanoTime();
        library.search(999999);
        long endTime = System.nanoTime();
        double elapsedTimeLinear = (endTime - startTime) / 1_000_000.0; // 변환하여 소수점 단위로 나타냄
        System.out.println("Linear search time: " + elapsedTimeLinear + "ms");

        startTime = System.nanoTime();
        library.search_bs(999999);
        endTime = System.nanoTime();
        double elapsedTimeBinary = (endTime - startTime) / 1_000_000.0; // 변환하여 소수점 단위로 나타냄
        System.out.println("Binary search time: " + elapsedTimeBinary + "ms");
    }
}
