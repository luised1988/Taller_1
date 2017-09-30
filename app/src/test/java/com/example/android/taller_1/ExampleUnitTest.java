package com.example.android.taller_1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test
    public void Valor_correspondiente_Correcto1(){
        assertEquals(240000,Metodos.Hombre_Zapatilla_Nike(2,0,0,0),0);
    }

    @Test
    public void Valor_correspondiente_Correcto2(){
        assertEquals(280000,Metodos.Hombre_Zapatilla_Nike(2,0,0,1),0);
    }

    @Test
    public void Valor_correspondiente_Correcto3(){
        assertEquals(130000,Metodos.Hombre_Zapatilla_Nike(1,0,0,2),0);
    }

    @Test
    public void Valor_correspondiente_Correcto4(){
        assertEquals(50000,Metodos.Hombre_Zapatilla_Nike(1,0,1,0),0);
    }

    @Test
    public void Valor_correspondiente_Correcto5(){
        assertEquals(80000,Metodos.Hombre_Zapatilla_Nike(1,0,1,1),0);
    }

    @Test
    public void Valor_correspondiente_Correcto6(){
        assertEquals(100000,Metodos.Hombre_Zapatilla_Nike(1,0,1,2),0);
    }

    @Test
    public void Valor_correspondiente_Correcto7(){
        assertEquals(100000,Metodos.Hombre_Zapatilla_Nike(1,1,0,0),0);
    }

    @Test
    public void Valor_correspondiente_Correcto8(){
        assertEquals(130000,Metodos.Hombre_Zapatilla_Nike(1,1,0,1),0);
    }

    @Test
    public void Valor_correspondiente_Correcto9(){
        assertEquals(110000,Metodos.Hombre_Zapatilla_Nike(1,1,0,2),0);
    }

    @Test
    public void Valor_correspondiente_Correcto10(){
        assertEquals(60000,Metodos.Hombre_Zapatilla_Nike(1,1,1,0),0);
    }

    @Test
    public void Valor_correspondiente_Correcto11(){
        assertEquals(70000,Metodos.Hombre_Zapatilla_Nike(1,1,1,1),0);
    }

    @Test
    public void Valor_correspondiente_Correcto12(){
        assertEquals(120000,Metodos.Hombre_Zapatilla_Nike(1,1,1,2),0);
    }


    @Test
    public void Valor_correspondiente_NoCorrecto1(){
        assertNotEquals(20000,Metodos.Hombre_Zapatilla_Nike(2,0,0,0),0);
    }

    @Test
    public void Valor_correspondiente_NoCorrecto2(){
        assertNotEquals(20000,Metodos.Hombre_Zapatilla_Nike(2,0,0,1),0);
    }

    @Test
    public void Valor_correspondiente_NoCorrecto3(){
        assertNotEquals(10000,Metodos.Hombre_Zapatilla_Nike(1,0,0,2),0);
    }

    @Test
    public void Valor_correspondiente_NoCorrecto4(){
        assertNotEquals(5000,Metodos.Hombre_Zapatilla_Nike(1,0,1,0),0);
    }

    @Test
    public void Valor_correspondiente_NoCorrecto5(){
        assertNotEquals(8000,Metodos.Hombre_Zapatilla_Nike(1,0,1,1),0);
    }

    @Test
    public void Valor_correspondiente_NoCorrecto6(){
        assertNotEquals(10000,Metodos.Hombre_Zapatilla_Nike(1,0,1,2),0);
    }

    @Test
    public void Valor_correspondiente_NoCorrecto7(){
        assertNotEquals(10000,Metodos.Hombre_Zapatilla_Nike(1,1,0,0),0);
    }

    @Test
    public void Valor_correspondiente_NoCorrecto8(){
        assertNotEquals(13000,Metodos.Hombre_Zapatilla_Nike(1,1,0,1),0);
    }

    @Test
    public void Valor_correspondiente_NoCorrecto9(){
        assertNotEquals(11000,Metodos.Hombre_Zapatilla_Nike(1,1,0,2),0);
    }

    @Test
    public void Valor_correspondiente_NoCorrecto10(){
        assertNotEquals(6000,Metodos.Hombre_Zapatilla_Nike(1,1,1,0),0);
    }

    @Test
    public void Valor_correspondiente_NoCorrecto11(){
        assertNotEquals(7000,Metodos.Hombre_Zapatilla_Nike(1,1,1,1),0);
    }

    @Test
    public void Valor_correspondiente_NoCorrecto12(){
        assertNotEquals(12000,Metodos.Hombre_Zapatilla_Nike(1,1,1,2),0);
    }
}