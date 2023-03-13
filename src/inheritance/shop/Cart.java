package inheritance.shop;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product prod = new Product();
        Smartphone phone = new Smartphone();
        Tv televison = new Tv();
        Headphone headphone = new Headphone();

        System.out.println("----Benvenuto in Booleazon----");
        System.out.println("Se vuoi comprare uno smartphone premi 1");
        System.out.println("Se vuoi comprare delle cuffie premi 2");
        System.out.println("Se vuoi comprare una TV premi 3");
        int userChoose = Integer.parseInt(scan.nextLine());
        switch (userChoose){
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


            }
            case 2 ->{
                System.out.println("Cuffie");
            }
            case 3 ->{
                System.out.println("TV");
            }
            case 4 ->{
                System.out.println("exit");
            }
        }





        System.out.println(prod);
        System.out.println(phone + "il prezzo con lo sconto è: " + phone.baseDiscount());

    }
}