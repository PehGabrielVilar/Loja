
import java.util.Scanner;


public class Principal {
   
   public static void main (String[] args){
       
        Carro carro = new Carro ();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("nome: ");
        carro.nome = scan.next();
        
        System.out.print("marca: ");
        carro.marca = scan.next();
        
        System.out.print("cor: ");
        carro.cor = scan.next();
        
        System.out.print("fabricacao: ");
        carro.fabricacao = scan.next();
        
        System.out.print("largura: ");
        carro.largura = scan.next();
        
        System.out.print("peso: ");
        carro.peso = scan.next();
         
        
        System.out.println("nome:" + carro.nome);
        System.out.println("marca: " + carro.marca);
        System.out.println("cor: " + carro.cor);
        System.out.println("fabricacao: " + carro.fabricacao);
        System.out.println("largura: " + carro.largura);
        System.out.println("peso: " + carro.peso);
         
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
