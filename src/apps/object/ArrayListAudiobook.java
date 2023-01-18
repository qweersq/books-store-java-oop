package apps.object;

import java.util.ArrayList;

public class ArrayListAudiobook {
    private static ArrayList<AudioBook> audiobooks = new ArrayList<AudioBook>();


    public static void addAudiobook(String title, String author, int price, String narrator, int length) {
        AudioBook Audiobook = new AudioBook(title, author, price, narrator, length);
        audiobooks.add(Audiobook);
    }

    public ArrayList<AudioBook> getBooks() {
        return audiobooks;
    }

    //get size 
    public static int getSize() {
        return audiobooks.size();
    }

    //get book
    public static String getTitle(int index) {
        return audiobooks.get(index).getTitle();
    }

    public static String getAuthor(int index) {
        return audiobooks.get(index).getAuthor();
    }

    public static String getCategory(int index) {
        return audiobooks.get(index).getCategory();
    }

    public static int getPrice(int index) {
        return audiobooks.get(index).getPrice();
    }

    public static String getNarrator(int index) {
        return audiobooks.get(index).getNarrator();
    }

    public static int getLength(int index) {
        return audiobooks.get(index).getLength();
    }


    //setter
    public static void setTitle(int index, String title) {
        audiobooks.get(index).setTitle(title);
    }

    public static void setAuthor(int index, String author) {
        audiobooks.get(index).setAuthor(author);
    }

    public static void setCategory(int index, String category) {
        audiobooks.get(index).setCategory(category);
    }

    public static void setPrice(int index, int price) {
        audiobooks.get(index).setPrice(price);
    }

    public static void setNarrator(int index, String narrator) {
        audiobooks.get(index).setNarrator(narrator);
    }

    public static void setLength(int index, int length) {
        audiobooks.get(index).setLength(length);
    }

    //delete book
    public static void deleteBook(int index) {
        audiobooks.remove(index);
    }

}
