public abstract class Personajes {
    public String nombre;
    public int vida;
    public int defensa;
    public int fuerza;

    public Personajes(String nombre, int vida, int defensa, int fuerza) {
        this.nombre = nombre;
        this.vida = vida;
        this.defensa = defensa;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public abstract int setVida(int a,int b);
    public abstract int ataque(int fuerzaextra);
}
