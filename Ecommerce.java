package javalab;

abstract class Product{
String name;
double price;

public Product(String name,double price) {
	// TODO Auto-generated constructor stub
     this.name=name;
     this.price=price;
}
abstract void displaydetails();
}

class Electronics extends Product{

	int warranty;
	public Electronics(String name, double price,int warranty) {	
		super(name, price);
		this.warranty=warranty;
		// TODO Auto-generated constructor stub
	}
	@Override
	void displaydetails() {
		// TODO Auto-generaed method stub
		System.out.println("product name "+name +", \nproduct cost= "+price+", \n"
				+ "warranty "+warranty+" years");	
	}
}
class Furniture extends Product{
	String material;
	public Furniture(String name, double price,String material) {
		
		super(name, price);
		this.material=material;
		// TODO Auto-generated constructor stub
	}

	@Override
	void displaydetails() {
		// TODO Auto-generated method stub
		System.out.println("product name "+name +", product cost= "+price+" material type "+material);
	}
	
}
public class Ecommerce {
public static void main(String[] args) {
	Product a=new Electronics("laptop",45000,2);
	Product b=new Furniture("dinning",5000,"wood");
	a.displaydetails();
	b.displaydetails();
}
}
