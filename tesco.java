class tesco{
	public static void main(String abc[]){
		int Quantity;
		float Price, Amount;
		String Product;
		Product ="Coke";
		Quantity =15;
		Price = 2.25f;
		Amount = Quantity*Price;
		System.out.println("Product:"+Product);
		System.out.println("Quantity:"+Quantity);
		System.out.println("Amount:"+Amount);
		System.out.println("VAT:"+((Amount*20)/100));
		System.out.println("Net Amount:"+(Amount-((Amount*20)/100)));
	}
}