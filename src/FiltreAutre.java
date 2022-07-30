/*
 * FiltreAutre.java
 */

/**
 * Dernier filtre qui effectue un traitement par d�faut (ConcreteHandler3)
 */
public class FiltreAutre extends AbstractFiltre {
  
  public FiltreAutre(AbstractFiltre next) {
    super(next);
  }

  public void request(String origine, String message) {
     System.out.println("Message plac� dans la bo�te au lettre pour triage manuel");
  }
  
}
