package coe528.mdp;

public class BadStanding implements State {
    private int credit;
    
    public void checkif(CreditScore creditscore) {
      System.out.println("Account is in bad standing");
      creditscore.setState(this);	
   }
    
     public double applyRestriction (double p) {
         if (credit < 500) {
            return p;
        } else if (credit >= 500) {
            return p;
        } else {
            return p;
        }
    }  

   public String toString(){
      return "Bad Standing";
   } 
}