
// default: quando nao define nada antes da classe
// private: acessivel somente dentro da classe que foi definida
// protected: acessivel por todo mundo que esta no mesmo pacote

class Carro {
   String modelo;

   public Carro(String var1) {
      System.out.println("Carro criado");
      this.modelo = var1;

      
      this.acelerar();
      
   }

   //com final: evita sobrescrita do metodo
   public final void acelerar() {
      System.out.println("Acelerando o " + this.modelo);
   }

}

class Rodas {
   public Rodas() {
      Carro carro = new Carro("Sandero");
      
      carro.acelerar();
   }
}
