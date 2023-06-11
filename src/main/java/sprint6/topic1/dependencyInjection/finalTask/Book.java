package sprint6.topic1.dependencyInjection.finalTask;

public class Book {
    private IAuthor author;
    private IPublisher publisher;

    public Book(IAuthor author, IPublisher publisher) {
        this.author = author;
        this.publisher = publisher;
    }

    public void printBookInfo() {
        System.out.println("Автор: " + author.getName());
        System.out.println("Год основания издательства: " + publisher.foundationYear());
    }
}
