package dependency;

import controller.MainController;
import service.MainService;

public class Main {

	public static void main(String[] args) {
		//DI가 적용되지 않은 MainController
		MainController mainController = new MainController();
		mainController.hello();
		
		// Contructor를 이용하여 DI가 구현된 MainController
		MainService mainService = new MainService();
		MainController mainControllerDi1 = new MainController(mainService);
		
		//Setter 메서드를 이용하여 DI가 구현된 MainController
		MainController mainControllerDi2 = new MainController();
		mainControllerDi2.setMainService(mainService);
	}
		
}
