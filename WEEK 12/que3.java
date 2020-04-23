import java.util.*;
public class Question123{
  public static void main(String[] args){
      Scanner s1 = new Scanner(System.in);
String f=s1.next();
String l=s1.next();
int n=s1.nextInt();
double db=s1.nextDouble();
double db1=s1.nextDouble();
double avg=(db+db1)/2;
System.out.print(f + l +" "+ n +" "+avg);
    }
}
