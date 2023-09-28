public abstract class Generador {

    public double resultadoXn1;
    public double multiplicadorA;

    public double moduloM;

    public double semillaX;


    public Generador(double semillaX, double multiplicadorA, double moduloM) {
        this.semillaX = semillaX;
        this.multiplicadorA = multiplicadorA;
        this.moduloM = moduloM;
    }

    public abstract double obtenerAleatorio();

    public int obtenerPeriodo(){
        double inicial = semillaX;
        int periodo = 0;
        do {
            obtenerAleatorio();
            periodo++;
        }while (obtenerAleatorio() != inicial);

        /*
        if (periodo == moduloM){ //este if es innecesario pero puede usarse para notificar de que el periodo es completo
            System.out.println("El generador tiene periodo completo");
        }
        */

        return periodo;
    }
}
/*
TEORÍA PARA COMPARTIR:
El proceso de generación de variables aleatorias no uniformes (requeridas para experimentos de simulación)
se hace a partir de la generación de números rectangulares (de distribución uniforme)
Nosotros vamos a generar estos números aleatorios mediante una relación de recurrencia (A estos números
se les dice números pseudoaleatorios)

Se los considera pseudoaleatorios porque si bien, pasan todas las pruebas estadísticas de aleatoriedad, son
completamente determinísticos

Algunas características de los números rectangulares que se generaron para asegurar o aumentar
la confiabilidad de los resultados obtenidos de la simulación:

1- Uniformemente distribuidos
2- Estadísticamente independientes
3- Reproducibles
4- De periodo largo (sin repeticiones dentro de una longitud determinada de la sucesión)
5- Generados a través de un método rápido
6- Generados a través de un método que no requiera mucha capacidad de almacenamiento de la computadora

Estos generadores congruenciales lineales generan una secuencia de números pseudoaleatorios
a partir del último número generado
* */