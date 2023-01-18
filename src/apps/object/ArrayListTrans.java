package apps.object;

import java.util.ArrayList;

public class ArrayListTrans {
    private static ArrayList<Transaction<String, Integer, Integer, Integer>> list = new ArrayList<Transaction<String, Integer, Integer, Integer>>();

    public ArrayListTrans() {
    }

    public static void addTrans(String name, int idbook, int qty, int amount) {
        list.add(new Transaction<String, Integer, Integer, Integer>(name, idbook, qty, amount));
    }

    // getter
    public static String getName(int index) {
        return list.get(index).getName();
    }

    public static int getIdBook(int index) {
        return list.get(index).getIdBook();
    }

    public static int getAmount(int index) {
        return list.get(index).getAmount();
    }

    public static int getQty(int index) {
        return list.get(index).getQty();
    }

    //get size
    public static int getSize() {
        return list.size();
    }

    //setter
    public static void setName(int index, String name) {
        list.get(index).setName(name);
    }

    public static void setIdBook(int index, int idBook) {
        list.get(index).setIdBook(idBook);
    }

    public static void setQty(int index, int qty) {
        list.get(index).setQty(qty);
    }

    public static void setAmountTrans(int index, int amount) {
        list.get(index).setAmount(amount);
    }

    public static void removeTrans(int index) {
        list.remove(index);
    }

    

}
