// !Exercice 1.1 — Se présenter en variables
public class SePresenter {
    public static void main(String[] args) throws Exception {
        String prenom = "John";
        int age = 30;
        double taille = 1.65;
        boolean actif = true;

        System.out.println("Bonjour, je m'appelle " + prenom + "!" + " " + "J'ai " + age + " " + "ans," + " je mesure " + taille + "m" + " et je suis majeur : " + actif);
    }
}

// ! Exercice 1.2 — Surface d'un rectangle
// Déclarez deux variables double longueur et largeur, calculez leur surface dans une
// troisième variable, puis affichez le résultat sous la forme d'une phrase complète.
// Exemple de sortie attendue :
// La surface du rectangle est de 12.5 m2

class Rectangle {
    public static void main(String[] args) {
        double longueur = 5.0;
        double largeur = 2.5;
        double surface = longueur * largeur;

        System.out.println("La surface du rectangle est de " + surface + " m2");
    }
}

//! Exercice 1.3 — Cercle et constantes
// Déclarez une constante PI valant 3.14159 (mot-clé final) et une variable rayon valant 5.0. Calculez et affichez la circonférence (2 × PI × rayon) et l'aire (PI × rayon × rayon) du cercle correspondant.

class Cercle {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double rayon = 5.0;
        double circonference = 2 * PI * rayon;
        double aire = PI * rayon * rayon;

        System.out.println("La circonférence du cercle est de " + circonference);
        System.out.println("L'aire du cercle est de " + aire);
    }
}

// todo: Partie 2 — Opérateurs et conversions de types

//! Exercice 2.1 - Pair ou impair
// Déclarez un entier nombre. À l'aide de l'opérateur % et d'un affichage direct (sans
// condition if), affichez si ce nombre est pair.

class Integers {
    public static void main(String[] args){
        int nombre = 2;
        boolean pair = nombre % 2 == 0;
        System.out.println(pair);
    }
}

//! Exercice 2.2 - Conversion avec perte
// Déclarez un double valant 19.99. Convertissez le en int à l'aide d'un cast, puis affichez les deux valeurs(avant et après conversion) pour observer la troncature de la partie décimale.

