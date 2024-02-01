package services;

public class PayPalService implements OnlinePaymentService {

    @Override
    public double paymentFree(double amount) {
        return amount * 0.02;
        // throw new UnsupportedOperationException("Unimplemented method 'paymentFree'");
    }

    @Override
    public double interest(double amount, int months) {
        return amount * 0.01 * months;
        // throw new UnsupportedOperationException("Unimplemented method 'interest'");
    }

    
}
