public class InicializadorInstancia2 {
   public InicializadorInstancia2() {
      number = 5;
   }
   public static void main(String[] args) {
      InicializadorInstancia2 initInstacia2 = new InicializadorInstancia2();
      System.out.println(initInstacia2.number);
   }
   private int number = 3;
   { number = 4; } 
}