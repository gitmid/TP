package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import logic.Item;
import logic.ShopService;

public class IndexController implements Controller{
	private ShopService shopService;
	public void setShopService(ShopService shopService){
		this.shopService = shopService;
	}
	// 요청시 호출되는 메서드 
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// itemList : DB의 item 테이블의 모든 레코드, 모든 컬럼 정보를 item 객체의 List로 저장 
		List<Item> itemList = shopService.getItemList();
		Map<String, Object> model = new HashMap<String,Object>();
		model.put("itemList", itemList);
		// ModelAndView : 뷰에 전달할 데이터 + 뷰이름 설정
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index"); // 뷰의 이름. viewResolver 에 의해 WEB-INF/jsp/index.jsp로 최종적으로 결정 
		mav.addAllObjects(model);
		return mav;
	}
}
