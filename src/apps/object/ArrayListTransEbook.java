
package apps.object;

import java.util.ArrayList;

public class ArrayListTransEbook {
    private static ArrayList<TransactionEbook<String, Integer, Integer, String>> listEbook = new ArrayList<TransactionEbook<String, Integer, Integer, String>>();

    public ArrayListTransEbook() {
    }

    public static void addTrans(String name, int idbook, int size, String format) {
        listEbook.add(new TransactionEbook<String, Integer, Integer, String>(name, idbook, size, format));
    }

    // getter
    public static String getName(int index) {
        return listEbook.get(index).getName();
    }

    public static int getIdEbook(int index) {
        return listEbook.get(index).getIdEbook();
    }

    public static String getFormat(int index) {
        return listEbook.get(index).getFormat();
    }

    public static int getSize(int index) {
        return listEbook.get(index).getSize();
    }

    //get size
    public static int getSize() {
        return listEbook.size();
    }

    //setter
    public static void setName(int index, String name) {
        listEbook.get(index).setName(name);
    }

    public static void setIdEbook(int index, int idBook) {
        listEbook.get(index).setIdEbook(idBook);
    }

    public static void setSize(int index, int size) {
        listEbook.get(index).setSize(size);
    }

    public static void setFormat(int index, String format) {
        listEbook.get(index).setFormat(format);
    }

    public static void removeTrans(int index) {
        listEbook.remove(index);
    }

    

}
