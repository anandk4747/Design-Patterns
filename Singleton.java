

// Singleton Pattern 

enum MODE {
    SLOW,
    FAST
}

class CarMode {
      
             private MODE mode;
      static private CarMode instance = null;  
      
      private CarMode(){
          this.mode = MODE.SLOW;
      }
      
      static CarMode getInstance(){
          
          if( instance == null) 
               instance = new CarMode(); 
        
          return instance;                        
      }
     
      void changeMode(){
         
         if( this.mode == MODE.SLOW ) this.mode = MODE.FAST;
         else                         this.mode = MODE.SLOW;
              
      }
      
      MODE getMode(){
          return this.mode;
      }
     
}

public class Main{
    
	public static void main(String[] args) {
	       
  	       CarMode instance = CarMode.getInstance();
  	    
           System.out.println(instance.getMode());
          
           instance.changeMode();
           
           System.out.println(instance.getMode());
          
	}
}
