import java.util.Scanner;
import java.util.ArrayList;
public class CartItem {
    ArrayList<CartItem> shoppingcart=new ArrayList<CartItem>();
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer>List;
   static boolean KeepGoing=true;
   static int input;
    static int choice;
       static  int item;
       String inProduct; 
       static List;
    public static void main(String[] args){
    while(KeepGoing)
    {
    System.out.println("2 Remove an item from your cart");
    System.out.println("3 View the items in your cart");
    System.out.println("4 Exit and add up the total");
    System.out.println("5 Empty your cart");
    System.out.println("6 Exit");
    System.out.println("Select a menu option");
      Scanner sc = new Scanner(System.in);
       choice = sc.nextInt();
            switch(choice) 
               {
                            case 1:
                                System.out.println("Enter an item:");
					input = sc.nextInt();
					item = input;
                                        static int List.add(item)
                                        break;
                                        
                            case 2:
                                System.out.println("Enter an item to remove:");
					input = sc.nextInt();
					item = new Integer(input);
					if (List.contains(item))
					{
						List.remove(item);
						System.out.println(item + " has been removed.");
					}
					else
					{
						System.out.println(item + " was not found in your shopping cart.");
					}
					break;
                            case 3:
                                System.out.println(List);
					break;
                            case 4:
                                for (int i = 0; i<List.size(); i++) 
					{
						item = List.get(i);
						int total = total + item.intValue();
					}
					System.out.println("Total is "+ total);
					System.out.println("Goodbye");
					KeepGoing = false;
					break;
                                    case 5:
                                    List.clear();
					break;
                                    case 6:
                                       KeepGoing = false;
					System.out.println("Goodbye");
                                    default:               
   }
}
                        while(choice != 6);
    }

    public CartItem() {
        this.List = new ArrayList<>();
    }
}

public class Shopping {
	private String product;
	private int quantity;
	private double price;
 
	public void CartItem2()
	{
		product = "";
		quantity = 0;
		price = 0.0;
                
	}
	public String getProduct()
	{
	return product;
	}
	public double getPrice()
	{
	return price;
	}
	public int getQuantity()
	{
	return quantity;
	}
	public CartItem1 (String inProduct, int inQuant, double e)
	{
		product = new String(inProduct);
		quantity = inQuant;
		price = inPrice;
                return CartItem1;
	}
	public boolean equals(CartItem item)
	{
            boolean result = false;
		if (this.product.equalsIgnoreCase(item.getProduct() && this.price == item.getPrice())
			result = true;
		else
			result = false;
 
		return result;
	}
 
        @Override
	public String toString()
	{
		
		String result="";
 
		return result;
	}
}
    

