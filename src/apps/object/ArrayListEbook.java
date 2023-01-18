package apps.object;

import java.util.ArrayList;

public class ArrayListEbook {
    private static ArrayList<Ebook> ebooks = new ArrayList<Ebook>();


    public static void addEbook(String title, String author, int price, String format, int size) {
        Ebook ebook = new Ebook(title, author, price, format, size);
        ebooks.add(ebook);
    }

    //get size 
    public static int getSize() {
        return ebooks.size();
    }

    //get book
    public static String getTitle(int index) {
        return ebooks.get(index).getTitle();
    }

    public static String getAuthor(int index) {
        return ebooks.get(index).getAuthor();
    }

    public static String getCategory(int index) {
        return ebooks.get(index).getCategory();
    }

    public static int getPrice(int index) {
        return ebooks.get(index).getPrice();
    }

    public static String getFormat(int index) {
        return ebooks.get(index).getFormat();
    }

    public static int getSize(int index) {
        return ebooks.get(index).getSize();
    }

    //setter
    public static void setTitle(int index, String title) {
        ebooks.get(index).setTitle(title);
    }

    public static void setAuthor(int index, String author) {
        ebooks.get(index).setAuthor(author);
    }

    public static void setCategory(int index, String category) {
        ebooks.get(index).setCategory(category);
    }

    public static void setPrice(int index, int price) {
        ebooks.get(index).setPrice(price);
    }

    public static void setFormat(int index, String format) {
        ebooks.get(index).setFormat(format);
    }

    public static void setSize(int index, int size) {
        ebooks.get(index).setSize(size);
    }

    //delete book
    public static void deleteEbook(int index) {
        ebooks.remove(index);
    }

}
