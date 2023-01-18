package apps.object;

public class BookNovel extends Book<String> {

    private int stock;

    public BookNovel(String title, String author, int stock, int price) {
      super(title, author, "Novel", price);
      this.stock = stock;
    }

    public int getStock() {
      return stock;
    }

    public void setStock(int stock) {
      this.stock = stock;
    }
  }
