package AbstractConcept;

public class TestCar {

	public static void main(String[] args) {
    BMW bmw=new BMW();
    bmw.start();
    bmw.stop();
    bmw.refuel();
    bmw.exelarate();
    
    
       Car c= new BMW();  //Dynamic polymorphism=>  child class object can be referred by 
         c.start();       //parent class reference or parent interface reference  
         c.stop();
         c.refuel();
         ((BMW) c).exelarate();
	}

}
