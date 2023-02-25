import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 1° instaciando o objeto
        
        Scanner input = new  Scanner(System.in);
        Vendedor vendedor = new Vendedor();
        // Declarando valores aos atributos
        System.out.println("Digite o seu nome: ");
        vendedor.setNome(input.next());
        System.out.println("Digite o seu salário : ");
        vendedor.setSalario(input.nextDouble());
        System.out.println("Digite as suas vendas: ");
        vendedor.setVendas(input.nextDouble());
        
        vendedor.calcularComissão();
        vendedor. calcularSalario_Final();

        System.out.println("Seus dados são: ");
		System.out.println("Nome: " + vendedor.getNome() + " Salário: " + vendedor.getSalario() + " Salário final:" + vendedor.getSalario_final()) ;
		
    }
}



