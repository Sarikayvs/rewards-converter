public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // Get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    // A method to convert from cash to miles
    public void convertFromCashToMiles() {
        milesValue = cashValue / 0.0035;
    }

    // A method to convert from miles to cash
    public void convertFromMilesToCash() {
        cashValue = milesValue * 0.0035;
    }
}