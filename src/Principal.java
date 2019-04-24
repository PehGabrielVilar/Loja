
import java.util.Scanner;


public class Principal {
   
   public static void main (String[] args){
       
        Carro carro1 = new Carro ();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("nome: ");
        carro1.setNome(scan.next());
        
        System.out.print("marca: ");
        carro1.marca = scan.next();
        
        System.out.print("cor: ");
        carro1.cor = scan.next();
        
        System.out.print("fabricacao: ");
        carro1.fabricacao = scan.next();
        
        System.out.print("largura: ");
        carro1.largura = scan.next();
        
        System.out.print("peso: ");
        carro1.peso = scan.next();
         
        
        System.out.println("nome:" + carro1.nome);
        System.out.println("marca: " + carro1.marca);
        System.out.println("cor: " + carro1.cor);
        System.out.println("fabricacao: " + carro1.fabricacao);
        System.out.println("largura: " + carro1.largura);
        System.out.println("peso: " + carro1.peso);
         
        Carro veiculo = new Carro ();
        
        System.out.print("nome: ");
        veiculo.nome = scan.next();
        
        System.out.print("marca: ");
        veiculo.marca = scan.next();
        
        System.out.print("cor: ");
        veiculo.cor = scan.next();
        
        System.out.print("fabricacao: ");
        veiculo.fabricacao = scan.next();
        
        System.out.print("largura: ");
        veiculo.largura = scan.next();
        
        System.out.print("peso: ");
        veiculo.peso = scan.next();
        
        System.out.println("nome: " + veiculo.nome);
        System.out.println("marca: " + veiculo.marca);
        System.out.println("cor: " + veiculo.cor);
        System.out.println("fabricacao: " + veiculo.fabricacao);
        System.out.println("largura: " + veiculo.largura);
        System.out.println("peso: " + veiculo.peso);
        
        
        
   }
}
