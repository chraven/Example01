package controller;

import service.MainService;

public class MainController {
	
	private MainService mainService;
	
	//MainController class는 MainService class에 의존.(Main안에 Controller 안에 service)
	public MainController() {
		this.mainService = new MainService();
	}

	// 1. Contructor(생성자)를 이용한 DI 구현
	public MainController(MainService mainSerivce) {
		this.mainService = mainService;
	}
	
	// 2. Setter 메서드를 이용한 DI 구현
	public void setMainService(MainService mainService) {
		this.mainService = mainService;
	}
	
	public void hello() {
		mainService.hello();
	}
}
