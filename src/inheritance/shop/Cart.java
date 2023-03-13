package inheritance.shop;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product prod = new Product();
        Smartphone phone = new Smartphone();
        Tv tv = new Tv();
        Headphone headphone = new Headphone();


        System.out.println("----Benvenuto in Booleazon----");
        System.out.println("Quanti prodotti vuoi comprare?");
        Product[] products = new Product[Integer.parseInt(scan.nextLine())];

        for(int i = 0; i < products.length; i++){

        System.out.println("Se vuoi comprare uno smartphone premi 1");
        System.out.println("Se vuoi comprare delle cuffie premi 2");
        System.out.println("Se vuoi comprare una TV premi 3");
        System.out.println("Se vuoi uscire permi 4");


        int userChoose = Integer.parseInt(scan.nextLine());

        switch (userChoose) {
            case 1 -> {
                System.out.println("Inserisci il nome dello smartphone: ");
                phone.setName(scan.nextLine());
                System.out.println("Inserisci una descrizione: ");
                phone.setDescription(scan.nextLine());
                System.out.println("Inserisci la quantita di memoria: ");
                phone.setMemory(Integer.parseInt(scan.nextLine()));
                System.out.println("Hai una fedelity card (Y/N): ");
                phone.setFedelityCard(scan.nextLine());
                phone.baseDiscount();
                System.out.println("Inserisci il prezzo: ");
                phone.setPrice(Integer.parseInt(scan.nextLine()));

                if(products[i] == null){
                    products[i] = phone;
                }


            }
            case 2 -> {
                System.out.println("Inserisci il nome dello cuffie: ");
                headphone.setName(scan.nextLine());
                System.out.println("Inserisci una descrizione: ");
                headphone.setDescription(scan.nextLine());
                System.out.println("Che colore sono le cuffie: ");
                headphone.setColor(scan.nextLine());
                System.out.println("Cuffia con cavo (Y/N)");
                headphone.setCable(scan.nextLine());
                System.out.println("Hai una fedelity card (Y/N)");
                headphone.setFedelityCard(scan.nextLine());
                System.out.println("Inserisci il prezzo: ");
                headphone.setPrice(Integer.parseInt(scan.nextLine()));
                headphone.baseDiscount();

                if(products[i] == null){
                    products[i] = headphone;
                }
            }
            case 3 -> {
                System.out.println("Inserisci il nome della TV: ");
                tv.setName(scan.nextLine());
                System.out.println("Inserisci una descrizione: ");
                tv.setDescription(scan.nextLine());
                System.out.println("Quanti pollici è: ");
                tv.setDimension(Integer.parseInt(scan.nextLine()));
                System.out.println("Indica se è una smart TV (Y/N): ");
                tv.setSmart(scan.nextLine());
                System.out.println("Hai una fedelity card (Y/N)");
                tv.setFedelityCard(scan.nextLine());
                System.out.println("Inserisci il prezzo: ");
                tv.setPrice(Integer.parseInt(scan.nextLine()));

                if(products[i] == null){
                    products[i] = tv;
                }
            }
            case 4 -> {
                System.out.println("exit");
                i = products.length;
                }
            }
        }
                for (Product product : products) {
                    System.out.println("Il tuo carrello contiene:");
                    System.out.println(product.getName() + " " + product.priceIva());
                    if (Objects.equals(product.getFedelityCard(), "y")) {
                        System.out.println("Con lo sconto il prezzo finale è: " + product.baseDiscount());
                    }

        }





        /*System.out.println(prod);
        System.out.println(phone);
        System.out.println(tv);
        System.out.println(headphone);*/

    }
}