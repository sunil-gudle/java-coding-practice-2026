package HashMapConcept;

import java.util.*;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // equals() — compare by VALUE
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        User other = (User) obj;
        return Objects.equals(name, other.name) && age == other.age;
    }

    // hashCode() — MUST be consistent with equals()!
    // Equal objects MUST return same hashCode!
    @Override
    public int hashCode() {
        return Objects.hash(name, age); // same fields as equals!
    }
}

public class EqaulsAndHashCode {
    public static void main(String[] args) {

        User u1 = new User("Raj", 25);
        User u2 = new User("Raj", 25);

        // equals() — works correctly!
        System.out.println(u1.equals(u2));   // ✅ true

        // hashCode() — now consistent!
        System.out.println(u1.hashCode());   // 12345 (same!)
        System.out.println(u2.hashCode());   // 12345 (same!)

        // HashSet — works correctly now!
        Set<User> userSet = new HashSet<>();
        userSet.add(u1);

        System.out.println(userSet.contains(u2)); // ✅ TRUE!
        System.out.println(userSet.size());        // ✅ 1 (no duplicate!)

        // HashMap — works correctly now!
        Map<User, String> userMap = new HashMap<>();
        userMap.put(u1, "Developer");

        System.out.println(userMap.get(u2)); // ✅ "Developer" — found!
    }
}
