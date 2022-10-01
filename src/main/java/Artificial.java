public class Artificial extends Personajes implements IFichaB {
    public int fuerzaArtificial;

    public Artificial(int fuerzaArtificial, String nombre, int vida, int defensa, int fuerza) {
        super(nombre, vida, defensa, fuerza);
        this.fuerzaArtificial = fuerzaArtificial;
    }

    public int getFuerzaArtificial() {
        return fuerzaArtificial;
    }

    public void setFuerzaArtificial(int fuerzaArtificial) {
        this.fuerzaArtificial = fuerzaArtificial;
    }

    @Override
    public int ataque(int fuerzaextra) {
        int fuerza_total=0;
        fuerza_total= fuerza + fuerzaArtificial + fuerzaextra;
        return fuerza_total;
    }

    @Override
    public int setVida(int a, int b) {
        int vida=100;
        if((a-b) > 0 ){
            vida= vida-(a-b);
        }else{
            vida=0;
        }
        return vida;
    }

    @Override
    public int Ataquesimple() {
        int extrapoder=0;
        extrapoder = Artificial.fuerzaExtra;
        System.out.println("Estas realizando un ataque Simple, con danio "+extrapoder);
        return extrapoder;
    }

    @Override
    public int Defensaferreo(int de, int defen) {
        int defensaextra=0;

        defensaextra = de + defen;
        System.out.println("Artificial esta realizando una defensa ferrea, con efecto de "+ defensaextra);
        return defensaextra;
    }

}
