package io.sjhello.refactoring.chapter12.replaceSubclassWithDelegate.example1;

public class Booking {
    private Show show;
    private String date;

    public Booking(Show show, String date) {
        this.show = show;
        this.date = date;
    }

    public boolean hasTalkback() {
        return show.getTalkBack() && !isPeakDay();
    }

    public boolean isPeakDay() {
        return false;
    }

    public Show getShow() {
        return show;
    }

    public int basePrice() {
        int result = this.show.getPrice();
        if (isPeakDay()) result += Math.round(result * 0.5);
        return result;
    }
}
