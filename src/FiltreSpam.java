/*
 * FiltreSpam.java
 */

/**
 * Filtre les messages s'il s'agit de spam (ConcreteHandler1)
 */
public class FiltreSpam extends AbstractFiltre {
  
  public FiltreSpam(AbstractFiltre next) {
    super(next);
  }

  public void request(String origine, String message) {
    if (message.toLowerCase().contains("spam")) {
      System.out.println("Ce message est un SPAM");
    } else {
      getNextHandler().request(origine, message);
    }
  }
  
}
