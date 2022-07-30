/*
 * AbstractFiltre.java
 */

/**
 * Filtre pour les messages reçus (AbstractHandler)
 */
public abstract class AbstractFiltre {
  private AbstractFiltre sucessor = null;
  
  public AbstractFiltre(AbstractFiltre next) {
    this.sucessor = next;
  }
  
  public AbstractFiltre getNextHandler() {
    return this.sucessor;
  }
  
  public abstract void request(String origine, String message);
  
}
