public class Task16 {
    public static void main(String[] args) {
        Animal gorilla = new Gorilla();

        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}

interface Animal{
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal{
    @Override
    public boolean feed(boolean timeToEat) {
        if(timeToEat == true){
            System.out.println("Put gorilla food into cage");
            return true;
        }
        else {
            System.out.println("Gorilla is hungry");
            return false;
        }
    }

    @Override
    public void groom() {
        System.out.println("Lather, Rinse, Repeat");
    }

    @Override
    public void pet() {
        System.out.println("Pet at your own risk");
    }
}