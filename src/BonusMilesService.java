public class BonusMilesService {
    public int calculate(int price) {
        int miles;
        int percent = 5;
        miles = price * percent / 100;
        return miles;
    }
}