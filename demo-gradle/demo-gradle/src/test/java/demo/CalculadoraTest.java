package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private final Calculadora calc = new Calculadora();

    @Test
    void debeSumarDosNumerosCorrectamente() {
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    void debeRestarDosNumerosCorrectamente() {
        assertEquals(6, calc.restar(10, 4));
    }

    @Test
    void debeMultiplicarDosNumerosCorrectamente() {
        assertEquals(42, calc.multiplicar(6, 7));
    }

    @Test
    void debeLanzarExcepcionAlDividirPorCero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(5, 0));
    }
}