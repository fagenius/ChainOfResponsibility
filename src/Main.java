
/*
 * Main.java
 */
public class Main {
  
  public static void main(String[] args) {
    AbstractFiltre chaine = new FiltreSpam(new FiltreUlaval(new FiltreAutre(null)));
    
    chaine.request("test@test.com", "spam: ceci est un spam !!!");
    chaine.request("registraire@ulaval.ca", "Message de l'Université Laval");
    chaine.request("test@test.com", "message non filtré");
  }
  
}
