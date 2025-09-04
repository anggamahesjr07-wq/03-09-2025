public class setTermRate {
    String name;
    double balance, rate;
    int term, monthsRemaining;

    public setTermRate(String name, double balance, double rate, int term) {
        this.name = name;
        this.balance = balance;
        this.rate = rate;
        this.term = term;
        this.monthsRemaining = term * 12;

        if (term > 0 && term <= 12) {
            rate = 0.05;
        } else if (term > 12 && term <= 24) {
            rate = 0.06;
        } else if (term > 24 && term <= 36) {
            rate = 0.07;
        } else if (term > 36 && term <= 48) {
            rate = 0.08;
        } else if (term > 48 && term <= 60) {
            rate = 0.09;
        } else {
            System.out.println("Invalid term");
            rate = 0.0;
        }
    }

}
