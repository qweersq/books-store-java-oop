package apps.object;

import java.util.ArrayList;

public class ArrayListUser {
    static ArrayList<User> users = new ArrayList<User>();

    public static void addUser(String username, String password, String role) {
        User user = new User(username, password, role);
        users.add(user);
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public static int getSize() {
        return users.size();
    }   

    public static String getUsername(int index) {
        return users.get(index).getUsername();
    }

    public static String getPassword(int index) {
        return users.get(index).getPassword();
    }

    public static String getRole(int index) {
        return users.get(index).getRole();
    }

    public static void setUsername(int index, String username) {
        users.get(index).setUsername(username);
    }

    public static void setPassword(int index, String password) {
        users.get(index).setPassword(password);
    }

    public static void setRole(int index, String role) {
        users.get(index).setRole(role);
    }
    
}
