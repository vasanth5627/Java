package Interview;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashCodeAndEquals {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        HashCodeAndEquals has = (HashCodeAndEquals) obj;
        return id == has.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "HashCodeAndEquals{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Set<HashCodeAndEquals> set = new HashSet<>();
        HashCodeAndEquals h1 = new HashCodeAndEquals();
        h1.setId(1);
        h1.setName("abc");
        HashCodeAndEquals h2 = new HashCodeAndEquals();
        h2.setId(1);
        h2.setName("ac");
        set.add(h1);
        set.add(h2);
        System.out.println(set);
    }

}
