public class GeneradorCongruencialMixto extends Generador {

    double constanteAditivaC;



    /*
    Teoría.
    La diferencia entre este generador congruencial y el generador congruencial multiplicativo, radica en que este
    cuenta con una variable que se suma al resultado de multiplicar la semilla por el multiplicado A.
    Por lo tanto se hace necesario otra forma para elegir los valores apropiados para los parámetros de esta función
    */

    public GeneradorCongruencialMixto(double multiplicadorA, double constanteAditivaC, double moduloM, double semillaX) {
        super(semillaX, multiplicadorA, moduloM);
        this.constanteAditivaC = constanteAditivaC;
    } //Constructor de la clase


    @Override
    public double obtenerAleatorio() { //método para generar 1 número pseudoaleatorio
        resultadoXn1 = (multiplicadorA * semillaX + constanteAditivaC) % moduloM; //relación de recurrencia
        semillaX = resultadoXn1; // Actualiza la semillaX para que el próximo resultado pueda variar
        return resultadoXn1;
    }
}

/*
teoría. consideraciones:
deberán ser: semillaX, multiplicadorA y constanteAditivaC >0
deberá ser: moduloM > semillaX, multiplicadorA y constanteAditivaC

-Los valores posibles de resultadoXn1 son desde 0 hasta (moduloM-1). Siendo moduloM la cantidad de valores diferentes que
se pueden generar.

*/

/*
    Teoría de selección correcta para constanteAditivaC:
    puede ser cualquiera pero mejor si:
    constanteAditivaC -> constanteAditivaC mod 8 = 5 en sistema binario y
    constanteAditivaC -> constanteAditivaC mod 200 = 21 en sistema decimal
    (entero impar y relativamente primo a moduloM)
*/

/*
    Teoría de selección correcta de moduloM:
    Opción 1: Número primo más grande que sea menor que P^d (P siendo la base del sistema
    binario/decimal/hexadecimal que se está usando y d, el número de bits que tiene una computadora en ese sistema
    (Ej: en sistema binario en una IBM 370 sería P = 2 y d = 32) //tranqui, eso es completamente teórico y del libro

    Opción 2(Comprobado que los números pseudoaleatorios generados no se comportan en forma aleatoria):
    moduloM = P^d, ya que cuando moduloM toma ese valor se facilita el cálculo del número rectangular, ya que solo
    se corre el punto binario o decimal a la izquierda del número // NO USAR, queda solo de forma teórica
*/
/*
    Teoría de selección correcta para semillaX:
    No importa mucho cuál se elija (menor que moduloM siempre)
*/

/*
    Teoría de selección correcta para multiplicadorA:
    debe ser un entero impar y no divisible entre 3 y 5 y siguiendo los criterios:
    - (multiplicadorA-1) mod 4 = 0 si 4 es un factor de moduloM
    - (multiplicadorA-1) mod b = 0 si b es un factor primo de moduloM

    Usualmente es 2^k +1 en sistemas binarios y 10^k + 1 en sistemas decimales (con k >= 2)
*/