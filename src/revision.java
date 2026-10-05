public class revision {
    public static void main(String[] args) {
        int nombre = 7;
        for (int index = 1; index <= 10; index++) {
           int resultat  = nombre* index; 

           System.out.println(nombre + "x" + index + "=" + resultat);
        } 
    }
    
}

// Calculer la somme de 1 à 100
/**
 * AdditionNumber
 */
class AdditionNumber {

    public static void main(String[] args) {
        int nombre = 1;
        int somme = 0;
        while (nombre <= 100) {
            somme += nombre;
            nombre++;
        }
        System.out.println(somme);
    }
}
