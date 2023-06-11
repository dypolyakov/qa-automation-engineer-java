package sprint6.topic1.dependencyInjection.finalTask;

public class Main {
    public static void main(String[] args) {
        IAuthor author = new FantasyAuthor();
        IPublisher publisher = new OldPublisher();
        Book book = new Book(author, publisher);
        book.printBookInfo();
    }
}
