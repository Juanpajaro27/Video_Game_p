public class main {

    public static void main(String[] args){
        Humanos humanos = new Humanos(75,"Juan Pablo",100,40,50);
        SuperHumanos shumanos = new SuperHumanos(80,"Albeiro",100,50,70);

        int ataque = humanos.AtaqueMultiple();
        int defensa = humanos.Defensadebil();
        int ataque2 = humanos.AtaqueMultiple();

        int vida2 = shumanos.setVida(ataque,defensa);

        System.out.println("La vida del humano es: "+ vida2);
    }
}
