package estudos;
import java.util.Locale;
public class ProductInfoPrinter {

	public static void main(String[] args) {	
			  String product1 = "Computer"; 
			  String product2 = "Office desk";
			  int age = 30;
			  int code = 5290;
			  char gender = 'F';
			  double price1 = 2100.0;
			  double price2 = 650.50;
			  double measure = 53.234567;
			  
			  //Record: 30 years old, code 5290 and gender: F
			  System.out.printf("Products:%nComputer, which price is $ %.2f%n", price1);
			  System.out.printf("Office desk, whitch price is $%.2f%n", price2);
		      System.out.printf("Record: %d yeard old, code %d and gender: %c%n", age, code, gender);
		      System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		      System.out.printf("Rouded (Three decimal places): %.5f%n", measure);
		      Locale.setDefault(Locale.US);
		      System.out.printf("Us decimal point: %.3f%n", measure);
	}

}
