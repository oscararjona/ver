package com.company;

public class Main {

    public static void main(String[] args) {
        /**
         * @ author oscar
         * @ version 1
         * /




            System.out.println("La calificación de " + args[0] + " : ");
            System.out.println("es... " + veredicto(args[1], args[2]));
        }
        private static String veredicto (String valor1, String valor2){
     /**
    * metodo para dar valor a argumentos ya insertados y devolver comentario segun valor
    * @ param valor1  valor del args 1 que indica la nota que as sacado
    * @ param valor2 valor del argumento 2 que indica la nota que te gustaria sacar
    * @ return devuelve expresion dependiendo si el valor1 es mayor o menor que el 2
      */

            if (valor1.equals(valor2)) {
                return "Perfecto. Has tenido buen criterio.";
            }
            if (Integer.valueOf(valor1) < Integer.valueOf(valor2)) {
                return "Has mejorado, o te ha llegado el éxito inesperado.";
            }
            return "Te has confiado. Falta realismo.";

        }
    }






