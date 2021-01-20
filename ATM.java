public class ATM {
    public int countBanknotes(int sum) {
        int[] banknotes = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};
        int counter = 0;
        int banknoteCount = 0;
        while (counter < banknotes.length) {
            banknoteCount += sum / banknotes[counter];
            sum %= banknotes[counter];
            counter++;
        }
        return banknoteCount;
    }
    public static void main(String[] args) {
        System.out.println(new ATM().countBanknotes(578));
    }
}
