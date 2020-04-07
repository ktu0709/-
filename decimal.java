
public class Hello {

	public static void main(String[] args) {
    int x; //임의의 수 
    int y; //비교수
    
    System.out.println("2부터 100까지 소수:");
    for(x=1;x<100;x++) {
    	y=2;
    while(y<x)
    {
    	if(x%y==0)
    		break;
    	else
    		y++;
    }
    if(x==y)
    {
    	System.out.println(y);
    }
   }
	
	}
}
