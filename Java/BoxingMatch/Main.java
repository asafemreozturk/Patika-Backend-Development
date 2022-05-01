public class Main {
    public static void main(String[] args) {
        Fighter hasan = new Fighter("Hasan" , 12 , 95, 85, 0);
        Fighter mehmet = new Fighter("Mehmet" , 12 , 95, 85, 0);
        Ring r = new Ring(hasan,mehmet , 80 , 100);
        r.run();
    }
}



