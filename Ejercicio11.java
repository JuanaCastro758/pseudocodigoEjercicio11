import java.util.*;
public class Ejercicio11{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        Random aleatorio=new Random();
        int impar=0,docena=0,num=0;;
        float spar=0,par=0;
        for (int i=0;i<10;i++){
             int x=aleatorio.nextInt(36-0+1)+0;
             System.out.println(" "+x);
            if (x%2!=0){
                impar++;
            }
            if ((x % 2==0) && (x!=0)){
                spar+=x;
                par++;
            }
            if (x<=24 && x>=13){
                docena++;
            }
            if(x>=num){
                num=x;
            }
        }
        float p1=spar/par;
        System.out.println("a. impares: "+impar);
        System.out.println("b. promedio de pares: "+p1);
        System.out.println("c. cantidad: "+docena);
        System.out.println("d. mayor: "+num);
        System.out.println("e. se utiliza un ciclo while con la condicion de que el numero ingresado no dede de ser igual a 36");
    }
}