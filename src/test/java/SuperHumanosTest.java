import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperHumanosTest {

    @Test
    public void TestAtaque(){
        SuperHumanos suhumanos = new SuperHumanos(50,"Angel",100,80,10);
        int fuerzatotal= 0;
        fuerzatotal = suhumanos.getFuerzaSuperHum() + suhumanos.getFuerza() + 10;

        assertEquals(70,fuerzatotal);

    }

    @Test
    public void TestSetVida(){

        SuperHumanos suhumanos = new SuperHumanos(50,"Angel",100,80,10);
        int suhumanavida= suhumanos.getVida();
        if((80-suhumanos.getDefensa()) > 0 ){
            suhumanavida= suhumanavida-(80-suhumanavida);
        }else{
            suhumanavida=0;
        }

        assertNotEquals(10,suhumanavida);
    }

    @Test
    public void TestAtaqueSimple(){
        SuperHumanos suhumanos = new SuperHumanos(50,"Angel",100,80,10);
        int fuerzasimple = suhumanos.getFuerza() + suhumanos.getFuerzaSuperHum();

        assertNotEquals(100,fuerzasimple);

    }

    @Test
    public void TestDefensaFerrea(){
        SuperHumanos suhumanos = new SuperHumanos(60,"Angel",100,80,10);
        int defensaextra = 20;

        defensaextra = defensaextra + suhumanos.getDefensa();

        assertEquals(100,defensaextra);
    }
}