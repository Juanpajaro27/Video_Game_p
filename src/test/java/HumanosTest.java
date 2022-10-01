import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanosTest {

    @Test
    public void TestsetVida(){

        Humanos humanos = new Humanos(10,"Helbert",100,50,70);
        int vidahumano = humanos.getVida();
        if((100-humanos.getDefensa()) > 0 ){
            vidahumano = humanos.getVida()-(100-humanos.getDefensa());
        }else{
            vidahumano=0;
        }

        assertNotEquals(0,vidahumano);
    }

    @Test
    public void TestAtaqueMultiple(){

        Humanos humanos = new Humanos(10,"Helbert",100,50,70);
        int extrapoder =20;

        extrapoder = extrapoder + humanos.getFuerza() + humanos.getFuerzaHumana();
        assertNotEquals(120,extrapoder);
    }

    @Test
    public void TestDefensaDebil(){
        Humanos humanos = new Humanos(10,"Helbert",100,50,70);
        int defensaextra = 10;

        defensaextra = defensaextra + humanos.getDefensa();
        assertNotEquals(70,defensaextra);
    }

}