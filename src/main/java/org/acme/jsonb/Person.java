package org.acme.jsonb;

public class Person {
    String first;
    String last;

    public Person() {
    }

    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return this.first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return this.last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "{" +
            " first='" + first + "'" +
            ", last='" + last + "'" +
            "}";
    }

}