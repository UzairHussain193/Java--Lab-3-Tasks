import java.util.Scanner;
public class table{
public static void main(String[] args){
	System.out.println("Enter starting value : ");
	System.out.println("Enter ending value : ");
	System.out.println("Enter table value : ");
	Scanner a=new Scanner(System.in);	
	int x=a.nextInt();
	int y=a.nextInt();
	int z=a.nextInt();
	
	for(int i=x;i<=y;i++){
	System.out.println(z+" * "+i+ " = "+ z*i);
	}
	


}
}
