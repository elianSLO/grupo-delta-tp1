package demo;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(StringUtils.capitalize("demo de gradle - grupo DELTA"));
        System.out.println("2 + 3 = " + calc.sumar(2, 3));
        System.out.println("10 - 4 = " + calc.restar(10, 4));
        System.out.println("6 * 7 = " + calc.multiplicar(6, 7));
        System.out.println("8 / 2 = " + calc.dividir(8, 2));
    }
}
