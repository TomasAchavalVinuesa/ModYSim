public class GeneradorCongruencialMultiplicativo extends Generador {

    public GeneradorCongruencialMultiplicativo(double semillaX, double multiplicadorA, double moduloM) {
        super(semillaX, multiplicadorA, moduloM);
    }//Constructor de la clase
    @Override
    public double obtenerAleatorio() {
        resultadoXn1 = (multiplicadorA * semillaX) % moduloM;
        semillaX = resultadoXn1; // Actualiza la semillaX para que el próximo resultado pueda variar
        return resultadoXn1;
    }
}

/*
    Teoría selección correcta de multiplicadorA:
    en sistema decimal:
    -El valor de semillaX, puede ser cualquier número impar no divisible entre 2 ni 5 y relativamente primo
    a moduloM
    -multiplicadorA se debe obtener de la siguiente identidad:
    multiplicadorA = 200*t +- P (t es cualquier entero y p es: 3, 11, 13, 19, 21, 27, 29, 37, 53, 59, 61, 67,
    69,77, 83, 91
    -moduloM puede ser 10^d. si moduloM = 10 y d>=5, el periodo del generador es 5 * 10^d-2. Por otra parte si
    moduloM = 10 y d < 5, el periodo del generador se obtiene de calcular un mínimo común múltiplo


    En sistema binario:
    -semillaX: cualquier entero impart relativamente primo a moduloM
    -multiplicadorA se debe obtener de: multiplicadorA = 8*t +- 3 (t es cualquier entero)
    -moduloM = 2^d
*/
