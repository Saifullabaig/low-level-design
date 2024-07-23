public class CardPayment implements Payment{
    @Override
    public boolean processPayment(double amount) {
        return true;
    }
}
