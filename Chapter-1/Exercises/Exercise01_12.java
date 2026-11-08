public class Exercise01_12 {
    public static void main(String[] args) {
        int miles = 24;
        double time = (100.0 + (35.0 /60))/60;
        double km = miles * 1.6;
        System.out.println("The runner ran at " + (km / time) + " km per hour");

    }
}