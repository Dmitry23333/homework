package task;

import task.classes.DiscountCard;
import task.classes.Product;
import task.create_objects.CreateDiscountCards;
import task.create_objects.CreateProducts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int id;
        int quantity=0;
        int idCard = 0;
        int discountPromo = 10;
        double total;
        double total1 = 0;
        CreateProducts createProducts=new CreateProducts();
        CreateDiscountCards createDiscountCards=new CreateDiscountCards();
        List<Product> products = createProducts.create();
        List<DiscountCard> discountCards = createDiscountCards.create();
        Scanner scanner = new Scanner(System.in);
        String tmp = "";
        int count=0;
        StringBuilder mainContent = new StringBuilder();
        StringBuilder contentWithPromo=new StringBuilder();
        StringBuilder content=new StringBuilder();
        int flag=0;
        while (!tmp.equals("1")) {
            System.out.println("enter the product id ");
            try {
                id =scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
                break;
            }
            System.out.println("enter the product quantity ");
            try {
                quantity = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Press 1 to print receipt or press any key to continue add products");
            tmp = scanner.next();
            for (Product product : products) {
                if (id==product.getId()) {
                    total = product.getPrice() * quantity;
                    if (product.isPromo() || flag == 1) {
                        count++;
                        double totalPromo = total - (total * discountPromo) / 100;
                        contentWithPromo.append(setFieldLength(product.getName(), 15));
                        contentWithPromo.append(String.format("%2.2f", product.getPrice())).append("\t");
                        contentWithPromo.append(quantity).append("\t");
                        contentWithPromo.append(String.format("%.2f", total)).append("\n");
                        contentWithPromo.append("Promo product, discount\t").append(discountPromo).append("% ");
                        contentWithPromo.append(String.format("%.2f", totalPromo)).append("\n");
                    }
                    content.append(setFieldLength(product.getName(), 15));
                    content.append(String.format("%2.2f", product.getPrice())).append("\t");
                    content.append(quantity).append("\t");
                    content.append(String.format("%.2f", total)).append("\n");
                    if (count >= 2) {
                        flag = 1;
                    }
                    total1 = total1 + total;
                    break;
                }
            }
        }
        if(count>=5){
            mainContent.append(contentWithPromo);
        }else{
            mainContent.append(content);
        }
        StringBuilder totalToPrint =new StringBuilder();
        totalToPrint.append("TOTAL ").append(String.format("%.2f",total1)).append("\n");
        String tmp1;
        System.out.println("Press 1 to add the credit card or press any key to print the receipt");
        tmp1 = scanner.next();
        System.out.println("enter the discount card id ");
        if (tmp1.equals("1")){
            try {
                 idCard = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Incorrect id card");
            }
            for (DiscountCard discountCard : discountCards) {
                if (idCard == discountCard.getId()) {
                        totalToPrint.append("Discount (").append(discountCard.getDiscount()).append("%)\t")
                                .append(String.format("%.2f", (total1 * discountCard.getDiscount()) / 100)).append("\n");
                        totalToPrint.append("TOTAL with discount ")
                                .append(String.format("%.2f", total1 - (total1 * discountCard.getDiscount()) / 100))
                                .append("\n");
                }
            }
        }
        System.out.println(createReceipt(mainContent, totalToPrint));
        saveReceipt(createReceipt(mainContent, totalToPrint));
        scanner.close();
    }

    public static String setFieldLength(String word,int length) {
        for (int i = word.length(); i <= length; i++) {
            word=word.concat(" ");
        }
        return word;
    }

    public static StringBuilder createReceipt(StringBuilder mainContent,StringBuilder total){
        Date date=new Date();
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("\t\tReceipt\n")
                .append("--------------------------------------\n")
                .append("name            price\tqty\ttotal \n")
                .append("--------------------------------------\n")
                .append(mainContent)
                .append("--------------------------------------\n")
                .append(total)
                .append("--------------------------------------\n")
                .append(date);
        return stringBuilder;
    }
    public static void saveReceipt(StringBuilder receipt){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("receipt.txt", true))) {
            writer.write(receipt+"\n");
            System.out.println("\nReceipt saved");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
