package apps.object;

public class Book<T> {
  private String title;
  private String author;
  private T category;
  private int price;

  public Book(String title, String author, T category, int price) {
    this.title = title;
    this.author = author;
    this.category = category;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public T getCategory() {
    return category;
  }

  public void setCategory(T category) {
    this.category = category;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}

