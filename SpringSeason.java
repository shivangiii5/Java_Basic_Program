import java.util.*;
public class SpringSeason{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int m = sc.nextInt();
int d = sc.nextInt();
if(m == 2 && d>= 12 || m==3 || m==4 && d<=11){
System.out.println("True");
}else{
System.out.println("False");
}
}
}
