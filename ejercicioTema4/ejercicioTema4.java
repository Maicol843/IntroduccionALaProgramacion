package ejercicioTema4;

public class ejercicioTema4 {
    public static void main(String[] args) {

        // if, else if, else
        int numeroIf = 0;
        if (numeroIf < 0) {
            System.out.println("La variable numeroIf " + numeroIf + " es negativo");
        } else if (numeroIf > 0) {
            System.out.println("La variable numeroIf " + numeroIf + " es positivo");
        } else {
            System.out.println("La variable numeroIf " + numeroIf + " es cero");
        }

        // while
        int numeroWhile = 1;
        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println("La variable numeroWhile ahora vale " + numeroWhile);
        }

        // do while
        int numeroDoWhile = 3;
        do {
            numeroDoWhile = numeroDoWhile + 1;
            System.out.println("La variable numeroDoWhile ahora vale " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        // for
        for (int numeroFor = 0; numeroFor <= 5; numeroFor++) {
            System.out.println("La variable numeroFor ahora vale " + numeroFor);
        }

        // switch
        String estacion = "primavera";
        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}
