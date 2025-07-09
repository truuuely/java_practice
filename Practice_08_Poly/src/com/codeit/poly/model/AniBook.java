package com.codeit.poly.model;

public class AniBook extends Book {
    private int accessAge;

    public AniBook() {
    }

    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append(" [").append(super.toString())
                .append(", accessAge=").append(accessAge).append("]");

        return sb.toString();
    }
}