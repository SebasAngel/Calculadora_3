package com.example.calculadora;
import Modelo.Calculadora;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * La clase MainActivity es la actividad principal de la aplicación de la calculadora.
 * Permite al usuario ingresar dos números y realizar varias operaciones matemáticas
 * (suma, resta, multiplicación, división y potenciación) utilizando la clase Calculadora.
 */
public class MainActivity extends AppCompatActivity {

    private EditText editTextNumero1;   // Campo de entrada para el primer número.
    private EditText editTextNumero2;   // Campo de entrada para el segundo número.
    private TextView textViewResultado; // Etiqueta para mostrar el resultado.
    private Calculadora Calculadora;    // Instancia de la clase Calculadora para realizar cálculos.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicialización de elementos de la interfaz de usuario y la Calculadora.
        editTextNumero1 = findViewById(R.id.numero1);
        editTextNumero2 = findViewById(R.id.numero2);
        textViewResultado = findViewById(R.id.respuesta);
        Calculadora = new Calculadora();

        // Configuración de manejadores de clic para los botones de operación.
        Button botonSuma = findViewById(R.id.boton_suma);
        Button botonResta = findViewById(R.id.boton_resta);
        Button botonMultiplicacion = findViewById(R.id.boton_multi);
        Button botonDivision = findViewById(R.id.boton_division);
        Button botonPotencia = findViewById(R.id.boton_potencia);

        // Manejador de clic para el botón "Suma".
        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener números ingresados, realizar la suma y mostrar el resultado.
                double numero1 = Double.parseDouble(editTextNumero1.getText().toString());
                double numero2 = Double.parseDouble(editTextNumero2.getText().toString());
                Calculadora.setNumero1(numero1);
                Calculadora.setNumero2(numero2);
                double resultado = Calculadora.sumar();
                mostrarResultado(resultado);
            }
        });

        // Manejador de clic para el botón "Resta".
        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener números ingresados, realizar la resta y mostrar el resultado.
                double numero1 = Double.parseDouble(editTextNumero1.getText().toString());
                double numero2 = Double.parseDouble(editTextNumero2.getText().toString());
                Calculadora.setNumero1(numero1);
                Calculadora.setNumero2(numero2);
                double resultado = Calculadora.restar();
                mostrarResultado(resultado);
            }
        });

        // Manejador de clic para el botón "Multiplicación".
        botonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener números ingresados, realizar la multiplicación y mostrar el resultado.
                double numero1 = Double.parseDouble(editTextNumero1.getText().toString());
                double numero2 = Double.parseDouble(editTextNumero2.getText().toString());
                Calculadora.setNumero1(numero1);
                Calculadora.setNumero2(numero2);
                double resultado = Calculadora.multiplicar();
                mostrarResultado(resultado);
            }
        });

        // Manejador de clic para el botón "División".
        botonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener números ingresados, realizar la división y mostrar el resultado.
                double numero1 = Double.parseDouble(editTextNumero1.getText().toString());
                double numero2 = Double.parseDouble(editTextNumero2.getText().toString());
                Calculadora.setNumero1(numero1);
                Calculadora.setNumero2(numero2);
                double resultado = Calculadora.dividir();
                mostrarResultado(resultado);
            }
        });

        // Manejador de clic para el botón "Potencia".
        botonPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener números ingresados, realizar la potenciación y mostrar el resultado.
                double numero1 = Double.parseDouble(editTextNumero1.getText().toString());
                double numero2 = Double.parseDouble(editTextNumero2.getText().toString());
                Calculadora.setNumero1(numero1);
                Calculadora.setNumero2(numero2);
                double resultado = Calculadora.potencia();
                mostrarResultado(resultado);
            }
        });
    }

    /**
     * Muestra el resultado en el TextView de la interfaz de usuario.
     *
     * @param resultado El resultado de la operación a mostrar.
     */
    private void mostrarResultado(double resultado) {
        String resultadoStr = String.valueOf(resultado);
        textViewResultado.setText(resultadoStr);
    }
}
