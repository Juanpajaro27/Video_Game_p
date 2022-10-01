import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtificialTest {

    @Test
    public void testAtaque(){
        Artificial artificial = new Artificial(75,"Juan Pablo",100,40,50);
        int fuerza_Total=0;
        fuerza_Total= artificial.getFuerza() + artificial.getFuerzaArtificial() + 10;

        assertNotEquals(fuerza_Total,134);
    }

    @Test
    public void TestSetvida(){
        int vida = 100;
        Artificial artificial = new Artificial(75,"Juan Pablo",100,40,50);
        if((artificial.defensa-120) > 0 ){
            vida= vida-(artificial.defensa-120);
        }else{
            vida=0;
        }
        assertEquals(0,vida);
    }

    @Test
    public void TestAtaqueSimple(){
        Artificial artificial = new Artificial(75,"Juan Pablo",100,40,50);
        int poderextra = 10;
        assertEquals(artificial.fuerzaArtificial,75);

    }

    @Test
    public void TestDefensaFerrea(){
        Artificial artificial = new Artificial(75,"Juan Pablo",100,40,50);
        int defensaExtra = 20;
        defensaExtra = defensaExtra + artificial.defensa;
        assertEquals(defensaExtra,60);
    }
}