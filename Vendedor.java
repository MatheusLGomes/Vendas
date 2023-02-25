public class Vendedor {
    private String nome;
    private double salario_fixo;
    private double vendas;
    public double comissão;
 
    //construtor
    public Vendedor (String nome, double salario_fixo, double vendas, double comissão) {
     this.nome = nome;
     this.salario_fixo = salario_fixo;
     this.vendas = vendas;
     this.comissão = comissão;
    }
    public Vendedor(){
 
    }
    public double calcularComissão( double vendas, double comissão){
     return (comissão * vendas);
    }
    
    public String getNome(){
     return nome;
    }
   public void setNome(String nome){
     this.nome = nome;
 
   }
   
    public double getSalario(){
      return salario_fixo;
    }
 
    public void setSalario(double salario_fixo){
     this.salario_fixo = salario_fixo;
    }
    
    public double getVendas(){
     return vendas;
    }
    public void setVendas(double vendas){
     this.vendas = vendas;
    }
 
     public double getComissão(){
     return comissão;
    }
    public void setComissão(double comissão){
     this.comissão = comissão;
    }
 }
 
 