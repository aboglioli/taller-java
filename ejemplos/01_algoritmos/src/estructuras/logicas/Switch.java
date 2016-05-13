package estructuras.logicas;

public class Switch {

    public static void main(String[] args) {
        int x = 5;

        switch (x) {
            case 1:
                System.out.println("x: 1");
                break;
            case 2:
            case 3:
                System.out.println("x: 2 ó 3");
                break;
            case 4:
            case 5:
                System.out.println("x: 4 ó 5");
                break;
            default:
                System.out.println("x no está en el reango de 1 a 5");
        }
    }
}
