public class Vendedor {
    private String nome;
    private double salario_fixo;
    private double vendas;
    public double comissão;
    public double salario_final;
    //construtor
    public Vendedor (String nome, double salario_fixo, double vendas, double comissão, double salario_final) {
     this.nome = nome;
     this.salario_fixo = salario_fixo;
     this.vendas = vendas;
     this.comissão = comissão;
     this.salario_final = salario_final;
    }
    public Vendedor(){
 
    }
    public double calcularComissão( double vendas, double comissão){
     return (comissão * vendas);
    }
    public  double salario_final(double salario_fixo, double comissão){
        return (salario_fixo + comissão);
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
    public double getSalario_final(){
        return salario_final;
       }
       public void setSalario_final(double salario_final){
        this.salario_final=salario_final;
       }
 }
 
 