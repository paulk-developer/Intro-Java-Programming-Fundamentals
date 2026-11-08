public class Exercise01_11 {
        static public double b = 1.0/7;
        static public double d = 1.0/13;
        static public double i = 1.0/45;
        static public int year = 365;
        static public int seconds = 86400;
        public static int peop = 312032486;
    public static int calculatePopulation(int years) {
        int pop;
        double changePerDay;
        changePerDay = (seconds * b) + (seconds * i) - (seconds * d);
        pop = (int)(changePerDay * year * years);
        return pop + peop;
    }
    public static void main(String[] args) {
        System.out.println("The population for Year 1 would be: " + calculatePopulation(1));
        System.out.println("The popluation for Year 2 would be: " + calculatePopulation(2));
        System.out.println("The popluation for Year 3 would be: " + calculatePopulation(3));
        System.out.println("The popluation for Year 4 would be: " + calculatePopulation(4));
        System.out.println("The popluation for Year 5 would be: " + calculatePopulation(5));
    }
}