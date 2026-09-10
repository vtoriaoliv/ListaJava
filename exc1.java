import java.util.Scanner;
import java.util.Arrays;
import org.w3c.dom.Text;


public class exc1 {
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print(" informe o nome do estudante ");
        String nome = sc.nextLine(); 
   
        sc.nextLine();

        int frequencia;
        double[] notas = new double[3];
       
      

        for(int i = 0; i < 3; i++){
             System.out.print(" informe as notas "); // serve para escrever e atribuir valores
             notas[i] = sc.nextInt(); 
              
             System.out.print(" informe as frequencias "); // serve para escrever e atribuir valores
             frequencia = sc.nextInt(); 
             
             sc.nextLine();
        }
        
        double media = mediaNotas(notas);
        
        System.out.print( "A media das notas é:  " + media ) ;

    
     }

    public static double mediaNotas( double[]notas)
    {
        double soma = 0;
        for (int i = 0; i < notas.length; i++){
             soma += notas[i];
            
        }
        return ( soma / notas.length);
        
    }

    public static void frequenciAluno( int frequencia, double media){
        
        if( ( frequencia >= 75 ) && ( media >=  7 ) ){
           
         System.out.println("Aprovado");

        }
        else if((frequencia >= 75) && ( media >= 5 &&  media < 7)){
          System.out.println("recuperção");
        }
        else if((frequencia >= 75) &&)
    }
}
