package apps.object;

public class AudioBook extends Book<String> {
    private String narrator;
    private int length;

    public AudioBook(String title, String author, int price, String narrator, int length) {
        super(title, author, "Audio Book", price);
        this.narrator = narrator;
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
