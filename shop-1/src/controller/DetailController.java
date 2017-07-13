package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import logic.Item;
import logic.ShopService;

// 컨트롤러 인터페이스 구현대신 @방식 사용 
// @Controller : Controller 기능을 하는 클래스  
@Controller
public class DetailController {
	private ShopService shopService;
	public void setShopService(ShopService shopService){
		this.shopService = shopService;
	}
	
	// 요청시 호출되는 메서드 (handleRequest 역할) 
	@RequestMapping
	public ModelAndView detailItem(Integer id){ // 매개변수 이름이 파라미터 이름과 같으면 자동으로 전달 (id매개변수에 id이름의 파라미터값) , request객체가 필요하면 매개변수만 써주면 전달받을 수 있음
		// 파라미터값은 기본 String값으로 전달. 
		// Integer 형태로 받으면 자동 형변환도 해줌.(int로는 사용불가, String에서 형변환해서 받아야하기때문에) 
		Item item = shopService.getItemById(id);
		ModelAndView mav = new ModelAndView("detail"); // 생성+이름설정 
		mav.addObject("item",item);
		return mav;
	}
}
