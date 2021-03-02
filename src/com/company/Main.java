package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // On affiche le nombre de couverts
        System.out.println("Combien sont-ils ? ");
        int couvert = sc.nextInt();
        sc.nextLine();

        // Boucle
            for (int invite=0; invite<couvert;invite++)

        {   // On affiche un message pour demander le plat
            System.out.println("Entrez le plat : ");
            String plat = sc.nextLine();

            // On affiche un message pour demander le prix du plat
            System.out.println("Prix du plat ? ");
            float prix = sc.nextFloat();

            // On affiche un message pour demander la quantité
            System.out.println("Quantité ? ");
            int quantite = sc.nextInt();
            sc.nextLine();

            // Calcul et affichage du prix
            float produit = (prix * quantite);
            System.out.println("Total = " + produit);}
        }

        // On ferme l'addition
          sc.close();
    }

