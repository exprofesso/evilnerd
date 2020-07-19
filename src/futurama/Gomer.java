package futurama;

public class Gomer extends Multik {
    public static void main(String[] args) {

        Emi emi = new Emi("Остап", "Бендер");
        Emi emi1 = new Emi("Киса", "Воробьянов");
        Emi emi2 = new Emi("паняковский", "неизвесный");
        Emi emi3 = new Emi("Шура", "балаганов");
        System.out.println();
        System.out.println(emi2.getFname());
        System.out.println(emi2.getLname());
        System.out.println(Emi.getCount());

        Rik rik = new Rik();
        rik.mult();

      }
}
