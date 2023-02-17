public class Main {
    public static void main(String[] args) {

     Animals eagle = new Eagle();
     Animals parrot = new Parrot();
     Animals bee = new Bee();



     Skytrans helicopter = new Helicopter();
     Skytrans airplane = new Airplane();
     Skytrans aerostat = new Aerostat();


     Animals[] zoo = {eagle};
        for (Animals a : zoo) {
            System.out.println(a);
            eagle.eat();
        }

        Skytrans[] hangar = {helicopter};
        for (Skytrans s: hangar) {
            System.out.println(s);
            helicopter.razmer();
        }
    }

}