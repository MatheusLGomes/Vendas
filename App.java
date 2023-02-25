public class App {
    public static void main(String[] args) throws Exception {
        // 1° instaciando o objeto
        Vendedor vendedor = new Vendedor();
        // Declarando valores aos atributos
        vendedor.setNome("Matheus");
        vendedor.setSalario(1200);
        vendedor.setVendas(800);
        vendedor.setComissão(0.15);
        double comissão = (vendedor.getVendas() * vendedor.getComissão()) + vendedor.getSalario();
        vendedor.calcularComissão(vendedor.getComissão(), vendedor.getVendas());
        System.out.println("Olá "+ vendedor.getNome()+ "! Seu salário fixo é "+ vendedor.getSalario()+ " e o seu salário do mês é: "+ vendedor.calcularComissão(comissão, comissão));
    }
}



