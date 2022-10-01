import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AliensTests {
    @Test
    public void testSetvida(){
        Aliens aliens = new Aliens(30,"Alien32",50,30,40);
        int esperado = aliens.setVida(40,20);
        int resultado = aliens.setVida(40,20);
        assertEquals(esperado,resultado);
        //Assertions.assertEquals(esperado,resultado);
    }

}