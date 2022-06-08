import java.util.Scanner;
import java.lang.Math.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter the amount of individuals with that reccesive trait expressed" + "\n" + "Then enter the total amount of individuals in the dataset");
    Scanner myObj = new Scanner(System.in);
    double Recessive = myObj.nextDouble();  
    double Total = myObj.nextDouble();
    double Recessive_Recessive = Recessive/Total; 
    double Recessive_Frequency = Math.sqrt(Recessive_Recessive);
    double Dominant_Frequency = 1 - Recessive_Frequency;
    double Dominant_Dominant = Dominant_Frequency * Dominant_Frequency;
    double Dominant_Recessive = Dominant_Frequency*Recessive_Frequency*2;
    System.out.println("Recessive Recessive = " + Math.round(Recessive_Recessive*100)+"%");
    System.out.println("Recessive Domiant = " + Math.round(Dominant_Recessive*100)+"%");
    System.out.println("Dominant Dominant = " + Math.round(Dominant_Dominant*100)+"%"); 
    System.out.println("Dominant Probablity = " + Math.round(Dominant_Frequency*100)+"%");
    System.out.println("Recessive Probablity = " + Math.round(Recessive_Frequency*100)+"%");}}