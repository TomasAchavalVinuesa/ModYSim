public class Main {
    public static void main(String[] args) {
        GeneradorCongruencialMixto generador1 = new GeneradorCongruencialMixto(128, 13, 127, 42);
        int periodo = generador1.obtenerPeriodo();
        System.out.println(periodo);
    }
}
/*
        int n = 100; // N  número de elementos
        CongruencialMultiplicativo generador = new CongruencialMultiplicativo(3, 127, 7);

        int numeroAleatorio;
        CongruencialMixto generador1 =new CongruencialMixto(128,13,127,42); //multiplicador, constante aditiva, modulo y semilla
        CongruencialMultiplicativo generador2 = new CongruencialMultiplicativo(3,127,7);

        System.out.println("Generador Congruencial Mixto: ");
        for(int i=0; i< generador1.moduloM; i++){
            numeroAleatorio= generador1.obtenerAleatorio();
            System.out.println(numeroAleatorio);
        }

        System.out.println("\nGenerador Congruencial Multiplicativo: ");
        for(int i=0; i< generador2.moduloM; i++){
            numeroAleatorio= generador2.obtenerAleatorio();
            System.out.println(numeroAleatorio);
        }

        PruebaPromedio prueba = new PruebaPromedio(generador, n);
        prueba.realizarPrueba();
        CongruencialMixto generador20 = new CongruencialMixto(1245, 689, 100, 42); // Configuración específica

        PruebaPromedio prueba2 = new PruebaPromedio(generador20, n);
        prueba2.realizarPrueba();



    }


}*/