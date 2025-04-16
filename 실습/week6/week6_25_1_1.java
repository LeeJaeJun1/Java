package week6;

class Book {
    private String title;
    private String author;
    private String publisher;

    Book(String author, String title, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    @Override
    public boolean equals(Object obj) {
        Book b = (Book) obj;
        if(author == b.author && title == b.title) {
            return true;
        }
        else {
            return false;
        }

    }

    public String toString() {
        return (publisher + "이 구입한 도서: " +  author+ "의 " + title);
    }
}

public class week6_25_1_1 {
    public static void main(String[] args) {
        Book a = new Book("황기태", "명품자바", "김하진");
        Book b = new Book("황기태", "명품자바", "하여린");
        System.out.println(a);
        System.out.println(b);
        if(a.equals(b)) {
            System.out.println("같은 책");
        }
        else {
            System.out.println("다른 책");
        }

    }
}
