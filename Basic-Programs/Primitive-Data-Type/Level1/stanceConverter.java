   public calss DistanceConverter{
    public Static void main(String[] agrs){
	double km;
	Scanner input = new Scanner(System.in);
	 
	 System.out.println("Enter distance in kilometers (km): ");
	 km = input.nexDouble();
	 
	 double miles = km/1.6;
	  
	System.out.println("The total miles is " + miles + " mile for the given " +km + " km");
}
}	