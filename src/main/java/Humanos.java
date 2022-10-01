public class Humanos extends Personajes implements IFichaA{
    public int fuerzaHumana;

    public Humanos(int fuerzaHumana, String nombre, int vida, int defensa, int fuerza) {
        super(nombre, vida, defensa, fuerza);
        this.fuerzaHumana = fuerzaHumana;
    }

    public int getFuerzaHumana() {
        return fuerzaHumana;
    }

    public void setFuerzaHumana(int fuerzaHumana) {
        this.fuerzaHumana = fuerzaHumana;
    }

    @Override
    public int setVida(int atact,int defens) {
        int vida=100;
        if((atact-defens) > 0 ){
            vida= vida-(atact-defens);
        }else{
            vida=0;
        }
        return vida;
    }

    @Override
    public int ataque(int poder) {
        int fuerza_total=0;
        fuerza_total= fuerza + fuerzaHumana + poder;
        return fuerza_total;

    }

    @Override
    public int AtaqueMultiple() {
        int extrapoder=0;
        extrapoder = Humanos.Fuerzaextra;
        System.out.println("Estas realizando un ataque multiple, con danio "+extrapoder);
        return extrapoder;
    }

    @Override
    public int Defensadebil() {
        int defensaextra=0;

        defensaextra = Humanos.defensaextra + defensa;
        System.out.println("Se esta realizando una defensa ferrea, con efecto de "+ defensaextra);
        return defensaextra;
    }

}
