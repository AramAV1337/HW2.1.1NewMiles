public class BonusMilesService {
    public int calculate(int price) {
        int enominator;
        int miles;
        enominator = 20;
        miles = price / enominator;
        return miles;
    }
}
