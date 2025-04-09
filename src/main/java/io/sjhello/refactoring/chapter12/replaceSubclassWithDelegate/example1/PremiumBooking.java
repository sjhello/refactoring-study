package io.sjhello.refactoring.chapter12.replaceSubclassWithDelegate.example1;

public class PremiumBooking extends Booking {
    private Extra extras;

    public PremiumBooking(Show show, String date, Extra extras) {
        super(show, date);
        this.extras = extras;
    }

    @Override
    public boolean hasTalkback() {
        return this.getShow().getTalkBack();
    }

    @Override
    public int basePrice() {
        return Math.round(super.basePrice() + this.extras.getPremiumFee());
    }

    public boolean hasDinner() {
        return this.extras.isDinner() && !super.isPeakDay();
    }
}
