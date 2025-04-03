import java.util.Scanner;
public class currency{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("current currency:\n1 USD = 110rs\n1 INR = 1.6rs\n1EUR = 93.49rs ");
    System.out.print("\nEnter amount in NRS to convert:");
    double nrs= input.nextDouble();
    System.out.printf("USD:%.2f\n",convertToUSD(nrs));
    System.out.printf("INR:%.2f\n",convertToINR(nrs));
    System.out.printf("EUR:%.2f\n",convertToEUR(nrs));
     input.close();
    } 
    // function to convert NRS to USD
    public static double convertToUSD(double nrs) {
        double usdRate = 110;  
        return nrs * usdRate;
    }

    // Function to convert NRS to INR
    public static double convertToINR(double nrs) {
        double inrRate = 1.6;  
        return nrs * inrRate;
    }

    // Function to convert NRS to EUR
    public static double convertToEUR(double nrs) {
        double eurRate = 93.49; 
        return nrs * eurRate;
    }

}
