public class Vendedor {
    private String nome;
    private double salario_fixo;
    private double vendas;
    private double comissão;
    private double salario_final;
    
   
    //construtor
    public Vendedor (String nome, double salario_fixo, double vendas) {
     this.nome = nome;
     this.salario_fixo = salario_fixo;
     this.vendas = vendas;
  
    }
    public Vendedor(){
 
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
 
     
     public double calcularComissão(){
      return comissão = this.vendas*0.15;
    
     }

     public double calcularSalario_Final(){
      return salario_final = comissão + salario_fixo;
     }

     public double getSalario_final(){
      return salario_final;
     }

     public double getComissão(){
      return comissão;
     }
 }
 
 
