import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int nulo = 0;
 System.out.println("Digite o valor de x:");
int x = sc.nextInt(); System.out.println(""); System.out.println("Digite o valor de y:");
int y = sc.nextInt(); System.out.println("");

while (x != nulo && y != nulo){
if (x > nulo && y > nulo){
System.out.println("pertence ao 1° Quadrante.");
}
if(x > nulo && y < nulo){
System.out.println("Pertence ao 4° Quadrante.");
}
if (x < nulo && y > nulo){
System.out.println("Pertence ao 2° Quadrante.");
}
if (x < nulo && y < nulo){
System.out.println("Pertenceao 3° Quadrante.");
}
System.out.println("");
System.out.println("Digite o valor de x:");
x = sc.nextInt();
System.out.println("");
System.out.println("Digite o valor de y:");
y = sc.nextInt();
System.out.println("");
}
sc.close();
  }
}