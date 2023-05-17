
public class reCap_demo2_Arrays {

	public static void main(String[] args) {
		
		double[] list = {1.2, 2.0, 1.4, 1.9};
		
		double total=0;
		
		double max=list[0];
		
		
		
		for(double  listElement:list)
		{
			System.out.println(listElement);
			
			total = total + listElement;
			
			if(max<listElement)
			{
				max=listElement;
			}
			
			
		}
		System.out.println("Total:"+total);
		
		
		
		System.out.println("Max:"+max);
		

	}
}
