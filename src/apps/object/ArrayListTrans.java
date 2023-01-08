package apps.object;

import java.util.ArrayList;

public class ArrayListTrans {
    private static ArrayList<Transaction<String, String, String, Integer, Integer, Integer>> list = new ArrayList<Transaction<String, String, String, Integer, Integer, Integer>>();

    public ArrayListTrans() {
    }

    public static void addTrans(String name, String author, String title, int price, int qty, int amount) {
        list.add(new Transaction<String, String, String, Integer, Integer, Integer>(name, author, title, price, qty,
                amount));
    }

    // getter
    public String getName(int index) {
        return list.get(index).getName();
    }

    public static String getAuthor(int index) {
        return list.get(index).getAuthor();
    }

    public static String getTitle(int index) {
        return list.get(index).getTitle();
    }

    public static int getPrice(int index) {
        return list.get(index).getPrice();
    }

    public static int getAmount(int index) {
        return list.get(index).getAmount();
    }

    public static int getQty(int index) {
        return list.get(index).getQty();
    }

    //show transaction
    public static void showTrans() {
        System.out.println("Name\t\tAuthor\t\tTitle\t\tPrice\t\tQty\t\tAmount");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + "\t\t" + list.get(i).getAuthor() + "\t\t" + list.get(i).getTitle()
                    + "\t\t" + list.get(i).getPrice() + "\t\t" + list.get(i).getQty() + "\t\t" + list.get(i).getAmount());
        }
    }

}
