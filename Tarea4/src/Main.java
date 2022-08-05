public class Main {
    public static void main(String[] args)  {
        // Primer ejercicio
        int numeroIf = 4;
        if (numeroIf >= 1){
            System.out.println("Es positivo");
        } else if (numeroIf < 0){
            System.out.println("Es negativo");
        } else {
            System.out.println("Es 0");
        }

        // Segundo ejercicio
        int numeroWhile = 1;
        while(numeroWhile <3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile +1;
        }

        // Tercer ejercicio
        int numeroDoWhile = 2;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroDoWhile +1;
        }
        while(numeroWhile <3);

        // Cuarto ejercicio
        int numeroFor = 0;
        for(int i=3; i <= numeroFor; i++){
            System.out.println(numeroFor);
        }

        // Quinto ejercicio
        var estacion = "Verano";

        switch(estacion){
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            default:
                System.out.println("No es una estación");
        }
        

    }
}

// En este ejercicio practicarás las estructuras de control, para ello deberás crear: Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
//Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

//Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

//Incrementar el valor de la variable en uno cada vez que se ejecute.

//Mostrarlo por pantalla cada vez que se ejecute.

//Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

//Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

//Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.