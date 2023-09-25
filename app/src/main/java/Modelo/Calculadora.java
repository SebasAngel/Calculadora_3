package Modelo;

/**
 * La clase Calculadora representa una calculadora básica que puede realizar
 * operaciones matemáticas simples, como suma, resta, multiplicación, división
 * y potenciación.
 */
public class Calculadora {

    private double numero1;  // Primer número para las operaciones.
    private double numero2;  // Segundo número para las operaciones.

    /**
     * Constructor por defecto de la Calculadora.
     */
    public Calculadora() {
        // Constructor por defecto: no realiza ninguna operación especial.
    }

    /**
     * Obtiene el valor del primer número.
     *
     * @return El valor del primer número.
     */
    public double getNumero1() {
        return numero1;
    }

    /**
     * Establece el valor del primer número.
     *
     * @param numero1 El valor del primer número a establecer.
     */
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    /**
     * Obtiene el valor del segundo número.
     *
     * @return El valor del segundo número.
     */
    public double getNumero2() {
        return numero2;
    }

    /**
     * Establece el valor del segundo número.
     *
     * @param numero2 El valor del segundo número a establecer.
     */
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    /**
     * Realiza una operación de suma entre los dos números.
     *
     * @return El resultado de la suma.
     */
    public double sumar() {
        return numero1 + numero2;
    }

    /**
     * Realiza una operación de resta entre los dos números.
     *
     * @return El resultado de la resta.
     */
    public double restar() {
        return numero1 - numero2;
    }

    /**
     * Realiza una operación de multiplicación entre los dos números.
     *
     * @return El resultado de la multiplicación.
     */
    public double multiplicar() {
        return numero1 * numero2;
    }

    /**
     * Realiza una operación de división entre los dos números.
     *
     * @return El resultado de la división, o NaN si el segundo número es cero.
     */
    public double dividir() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            return Double.NaN; // Manejo de división por cero.
        }
    }

    /**
     * Calcula la potencia del primer número elevado al segundo número.
     *
     * @return El resultado de la potenciación.
     */
    public double potencia() {
        return Math.pow(numero1, numero2);
    }
}

