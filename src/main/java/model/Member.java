package model;

public class Member {
    private static int nextInt = 0;
    private int id;
    private final String name;
    private boolean paymentStatus;

    public Member(String name){
        this.id = nextInt++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
