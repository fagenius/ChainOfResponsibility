/*
 * FiltreAutre.java
 */

/**
 * Dernier filtre qui effectue un traitement par défaut (ConcreteHandler3)
 */
public class FiltreAutre extends AbstractFiltre {
  
  public FiltreAutre(AbstractFiltre next) {
    super(next);
  }

  public void request(String origine, String message) {
     System.out.println("Message placé dans la boîte au lettre pour triage manuel");
  }
  
}
