package AbstractConcept;

public class BMW implements Car{

	@Override
	public void start() {
     System.out.println("BMW can start");		
	}

	@Override
	public void stop() {
     System.out.println("BMW stop");		
	}

	@Override
	public void refuel() {
     System.out.println("BMW refuel");		
	}
	public void exelarate(){
		System.out.println("bmw can exalarate");
	}
	
	

}
