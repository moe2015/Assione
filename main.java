
public class Party {

    public static final double DEFAULT_BUDGET = 1000.00;

    private String name;
    private boolean speech;
    private double budget;
    private double total_purchase_amount;  
    
                                   
    public Party() {                 
      this.budget = DEFAULT_BUDGET;     
    }                                                                  
                                    
    public Party(double budget) {
      this.budget = budget;
    }

    public Party(String name, boolean speech) {
       this(name,speech);   
                                         
    }                                      
                                                                                                                                  
    public Party(String name, boolean speech, double budget) {
        this.name = name;
        this.speech = speech;
        this.budget = budget;
        
            }
   
    public boolean setName(String name){ 
     if(name!=NULL){
          this.name = name;
          return TRUE;
      }
      else return FALSE;
    }
    
   public void setSpeech (String speech){  
      if(speech!="YES") 
              this.speech = TRUE;
              return TRUE;
      else if(speech!="NO")  
             this.speech = FALSE;
            return TRUE;            
      else
              return FALSE; 
             
     public boolean setBudget ( double budget){
              if(budget > 0 || budget < 1000)
                  return TRUE;
                }
      else        return FALSE;            
                        
              
     public boolean setTotalPurchaseMount(double total_purchase_mount){ 
              if(mount >= 0){
                 return TRUE;
                   }
       else      return FALSE;         
              
        public String getName() { 
      return this.name;
    }
    
    public boolean getSpeech() {
      return this.speech;
    }    
     public boolean getBudget(){
       return this.budget;
    }  
     public boolean getTotalPurchaseMount(){
       return this.totalPurchaseMount;
    } 
  
      public Boolean isTransactionOk(double amount){

      if(amount>budget){   
          return true;
      }
       else {
          return false;
       }
   }






import javax.swing.JopationPane;

public class Budget {
  public static void main(String [] args) {
    final double STARTING_BUDGET = 2000.00;

    Boolean nameError = TRUE; 
    Boolean speechError = TRUE;  
    
    party person1 = new person(STARTING_BUDGET);   
    do{
       If(!nameError){ nameErrorJOptionPane.showMessage("Invalid Name!") };
       nameError = JOptionPane.showInputDIalog("Enter the name!");
       If(!speechError){ nameErrorJOptionPane.showMessage("Invalid input!") };
       speechError = JOptionPane.showInput..("Speech? Input Y/N/y/n/yes/no/YES/NO!");
    }while(!nameError || !speechError);        
 
    addPurchaseAmount(person1);
     
         Private void addPurchaseAmount() {

       do{
          try {         
If(isTransactionOk()) = {(totalPurchseAmount – 1) + (purchase cost –                                   Budget);
   }
          catch{
              ( NumberFormatException e)
	 totalPurchaseAmount = -1 
          }         
} while(!purchase.settotalPurchaseAmount(totalPurchaseAmount));

     
    private static person getNewPurchase() {
         party aperson = new person();
         
         double PurchaseCost;
         
     aperson.setName(JopationPane.showInputDialog(
         " Enter the name of today"));
      
    do {
      
   try { PurchaseCost = 
       Double.parseDouble(JOpationPane.showInputDIalog("enter the cost of the purchase" 
       + aperson. getNewPurchase()));
 
   catch (NumberFormatException e) {
        PurchaseCost = -1;
   } }
        While (!aperson.setPurchase(purchaseCost());
