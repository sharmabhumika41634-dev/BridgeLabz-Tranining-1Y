 public class Deom1  {

    public static void main(String[] args) {
	String str = "Java is easy";
	
	StringToKenizer st = new stringToKenizer(str);
	
	while (st.hasMoreToKens()){
	System.out.println(st.nextToKen());
	}
	}
	}