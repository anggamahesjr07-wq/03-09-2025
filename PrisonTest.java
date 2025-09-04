public class PrisonTest {
    public static void main(String[] args) {
        Prisoner JohnWick = new Prisoner();
        Prisoner TonyStark = new Prisoner();
        JohnWick.name = "John Wick";
        JohnWick.age = 45;
        JohnWick.height = 2.07;
        JohnWick.sentence = 10;

        TonyStark.name = "Tony Stark";
        TonyStark.age = 50;
        TonyStark.height = 1.85;
        TonyStark.sentence = 5;

        System.out.println(JohnWick);
        System.out.println(TonyStark);
        System.out.println(JohnWick == TonyStark);
        TonyStark.name = "John Wick";
        TonyStark.age = 45;
        TonyStark.height = 2.07;
        TonyStark.sentence = 10;
        System.out.println(JohnWick == TonyStark);
        JohnWick.think();
        TonyStark.think();
    }
}
