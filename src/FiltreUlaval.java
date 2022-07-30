/*
 * FiltreUlaval.java
 */

/**
 * Filtre pour les messages provenant de l'université Laval (ConcreteHandler2)
 */
public class FiltreUlaval extends AbstractFiltre {
  
  public FiltreUlaval(AbstractFiltre next) {
    super(next);
  }

  public void request(String origine, String message) {
     if (origine.toLowerCase().contains("ulaval")) {
      System.out.println("Ce message provient de l'Université Laval");
    } else {
      getNextHandler().request(origine, message);
    }
  }
  
}
