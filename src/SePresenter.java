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

class Conversion {
    public static void main(String[] args) {
        double valeurDouble = 19.99;
        int valeurInt = (int) valeurDouble;

        System.out.println("Valeur double : " + valeurDouble);
        System.out.println("Valeur int après conversion : " + valeurInt);
    }
}

//! Exercice 2.3 - Moyenne pondérée
// Trois notes, 12,15 et 8, on respectivement pour coefficients 2,3 et 1. Calculez et affichez la moyenne pondrérée de ces trois notes: (12*2 + 15*3 + 8*1) / (2+3+1)

class MoyennePonderee{
    public static void main(String[]  args) {
        int note1 = 12;
        int note2 = 15;
        int note3 = 8;
        int coefficient1 = note1 * 2;
        int coefficient2 = note2 * 3;
        int coefficient3 = note3 * 1;
        int totaleCoeffNote = coefficient1 + coefficient2 + coefficient3;
        int sumCoeff = 6;

        System.out.println("La moyenne pondérée de ces trois notes est :" +" "+ totaleCoeffNote/sumCoeff );
    }
}

// methode alternatif avec tableu indicé

class MoyennePonderee2{
    public static void main(String[] args) {
         int[] notes = {12, 15, 8};
         int[] coefficients = {2, 3, 1};

         int totalPoints = 0;
         int sumCoeff = 0;

         // loop through the index tables
         for (int i = 0; i < notes.length; i++){
            totalPoints += notes[i] * coefficients[i];
            sumCoeff += coefficients[i];
         }

         // Use double to get the precise decimal average
         double moyennePondree = (double) totalPoints / sumCoeff;

         System.out.println(" La moyenne pondérée de ces trois notes est : " + moyennePondree );
    }
}

// todo: Partie 3 —  Les conditions

//! Exercice 3.1 - Majeur ou mineur

// À partir d'une variable int age ( que vous choisissez), affichez << Majeur>> si age est supérieur ou égale à 18, sinon affichez << Mineur>>.
class AgeCondition {
    public static void main(String[] args) {
        int age = 20;
        String statut = (age >= 18)? "majeur" : "mineur";

        System.out.println("Vous êtes :" + " " + statut);
    }
}

//! Exercice 3.2 - Note en lettre
// À partir d'une variable int note (sur 20), affichez une appréciation selon le barème 
// suivant : « Excellent » si note >= 16, « Bien » si note >= 12, « Passable » si note >= 10,<< Insuffisant>> sinon.

class NoteEnLettre{
    public static void main(String[] args) {
        int note = 17;
        if (note>=16) {
            System.out.println("Excellent");
        } else if (note >= 12){
           System.out.println("Bien"); 
        } else if (note>=10){
            System.out.println("Passable");
        } else {
            System.out.println("Insuffisant");
        }
    }
}

//! Exercice 3.3 - Jour de la semaine
// À partir d'un entier jour (de 1 à 7), affichez lz nom du jour correspondant ( 1 = Lundi, 2 = Mardi...), à l'aide d'un switch (au choix, forme classique ou forme moderne vues en cours). Pour toute autre, valeur, affichez << Jour invalide>>.

class JourDeLaSemaine {
    public static void main(String[] args) {
        int jour = 8;
        switch(jour){
            case 1 -> System.out.println("Lundi");
            case 2 -> System.out.println("Mardi");
            case 3 -> System.out.println("Mecredi");
            case 4 -> System.out.println("Jeudi");
            case 5 -> System.out.println("Vendredi");
            case 6 -> System.out.println("Samedi");
            case 7 -> System.out.println("Dimanche");
            default -> System.out.println("Jour invalide");
        }
    }
}

// todo: Partie - 4 Les boucles

//! Exercice 4.1 — Table de multiplication
// À l'aide d'une boucle for, affichez la table de multiplication de 7, de 1 à 10.

class Multiplication{
    public static void main(String[] args){
        int nombre = 7;
        // Boucle qui va de 1 à 10 inclus
        for (int i=1; i <= 10; i++) {
            int resultat = nombre * i;
            System.out.println(nombre + "x" + i + "=" + resultat);
        }
    }
}

//! Exercice 4.2 — Somme de 1 à 100
// À l'aide d'une boucle while, calculez et affichez la somme des entiers de 1 à 100 ( le resultats attendu est 5050).

class Somme{
    public static void main(String[] args){
        int i = 1;
       while (i <= 100) {
           i++;
        } 
        System.out.println(i*(i-1)/2);
    }
}
// Bonne methode alternatif
class Somme1{
    public static void main(String[] args){
        int i = 1;
        int somme = 0;
        while (i <= 100) {
           somme += i;
           i++;
        }
        System.out.println(somme);
    }
}
//! Exercice 4.3 — Nombres pairs d'un tableau
// À l'aide d'une boucle for-each, parcourez le tableau int[] valeurs = {3,8,12,7,4,19,22} et n'affiche que les nombres pairs qu'il contient.
class NombresPairs {
    public static void main(String[] args) {
        int[] valeurs = {3, 8, 12, 7, 4, 19, 22};
        System.out.println("Les nombres paires sont :" );

        // vérification si les nombres sont paires
         for (int valeur : valeurs) {
            if (valeur % 2 == 0) {
                System.out.println(valeur);
            }
        }
    }
}

//! Exercice 4.4 - Triangle d'étoiles
// À l'aide de deux boucles imbriquées (une boucle for à l'intérieure d'une autre), affichez un triangle de 5 lignes d'étoiles,
class TriangleEtoiles{
    public static void main(String[] args){
         int nbLignes = 5;

        // Boucle externe : gère le numéro de la ligne (de 1 à 5)
        for (int i = 1; i<= nbLignes; i++) {
           for (int j = 1; j <= i; j++) {
            System.out.print("*"); // print sans "ln" pour rester sur la même ligne
           }
           // Retour à la ligne une fois que les étoiles de la ligne courante sont affichées
           System.out.println();
           } 
        }

    }
