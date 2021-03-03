package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialisation des demandes
        String plat = " ";

        // Stockage des données dans un tableau
        int[] Quantites = new int[3];
        String[] Plats = new String[3];
        float[] Produits = new float[3];

        // Boucle
        for (int invite = 0; plat.length() > 0; invite++) {

            // Message pour demander le plat
            System.out.println("Entrez le plat : ");
            plat = sc.nextLine();


            if (plat.length() > 0) {

                // Message pour demander le prix du plat
                System.out.println("Prix du plat ? ");
                float prix = sc.nextFloat();

                // Message pour demander la quantité
                System.out.println("Quantité ? ");
                int quantite = sc.nextInt();
                sc.nextLine();

                // Calcul et affichage du prix
                float produit = (prix * quantite);
                System.out.println("Total = " + produit + " €");

                // Remplissage du tableau
                Quantites[invite] = quantite;
                Plats[invite] = plat;
                Produits[invite] = produit;

            } else {
                System.out.println(" ");
            }
        }

        float TotalFinal = 0;

        // Ticket final
        System.out.println("------------------ Facture --------------------");
        System.out.println(" ");
        for (int facture = 0; facture < 3.; facture++) {
            System.out.print("x " + Quantites[facture] + "    ");
            System.out.print(Plats[facture] + "    ");
            System.out.print(Produits[facture] + " €");
            System.out.println(" ");
            TotalFinal = Produits[facture] + TotalFinal;
        }
        System.out.println(" ");
        System.out.println("Total : " + TotalFinal + " €");
        System.out.println(" ");
        System.out.println("---- Merci pour votre visite et à bientôt ----");

        sc.close();
    }
}




