package apps.object;

public class BookNovel extends Book<String> {
    public BookNovel(String title, String author, int stock, int price) {
      super(title, author, "Novel", stock, price);
    }
  }
