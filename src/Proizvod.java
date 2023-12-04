import java.util.Scanner;
public class Proizvod {
public static void main(String[] args) {
Scanner input = new Scanner (System.in);
System.out.println("Пресметај и испечати го бројот на членови во низата ");
System.out.print("Напишете го бројот на членови во низата ");
int n = input.nextInt();
int niza[] = new int[n];
System.out.println("Внесете ги членовите на низата:");
for (int i = 0; i < niza.length; i++) {
System.out.print(i + "-->");
niza[i] = input.nextInt(); // Vcitaj niza[i] - i-ti clen na niza
}
double p=1;
for(int i=0;i < niza.length;i++){
p=p*niza[i];
}
System.out.println("p="+p);
}
}
