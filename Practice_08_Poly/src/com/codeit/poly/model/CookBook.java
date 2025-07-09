package com.codeit.poly.model;

public class CookBook extends Book {
    private boolean coupon;

    public CookBook() {
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getClass().getSimpleName()).append(" [").append(super.toString())
                .append(", coupon=").append(coupon).append("]");
        return sb.toString();
    }
}
