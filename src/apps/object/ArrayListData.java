package apps.object;

import java.util.ArrayList;

public class ArrayListData {
    private static ArrayList<BookNovel> books = new ArrayList<BookNovel>();


    public static void addBook(String title, String author, String category, int stock, int price) {
        BookNovel book = new BookNovel(title, author, stock, price);
        books.add(book);
    }

    public ArrayList<BookNovel> getBooks() {
        return books;
    }

    //get size 
    public static int getSize() {
        return books.size();
    }

    //get book
    public static String getTitle(int index) {
        return books.get(index).getTitle();
    }

    public static String getAuthor(int index) {
        return books.get(index).getAuthor();
    }

    public static String getCategory(int index) {
        return books.get(index).getCategory();
    }

    public static int getStock(int index) {
        return books.get(index).getStock();
    }

    public static int getPrice(int index) {
        return books.get(index).getPrice();
    }

    //setter
    public static void setTitle(int index, String title) {
        books.get(index).setTitle(title);
    }

    public static void setAuthor(int index, String author) {
        books.get(index).setAuthor(author);
    }

    public static void setCategory(int index, String category) {
        books.get(index).setCategory(category);
    }

    public static void setStock(int index, int stock) {
        books.get(index).setStock(stock);
    }

    public static void setPrice(int index, int price) {
        books.get(index).setPrice(price);
    }

    //delete book
    public static void deleteBook(int index) {
        books.remove(index);
    }

}
