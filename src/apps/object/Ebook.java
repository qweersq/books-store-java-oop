package apps.object;

public class Ebook extends Book<String> {
    private String format;
    private int size;

    public Ebook(String title, String author, int price, String format, int size) {
        super(title, author, "E-Book", price);
        this.format = format;
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
