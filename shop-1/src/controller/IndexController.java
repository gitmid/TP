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
	// ��û�� ȣ��Ǵ� �޼��� 
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// itemList : DB�� item ���̺��� ��� ���ڵ�, ��� �÷� ������ item ��ü�� List�� ���� 
		List<Item> itemList = shopService.getItemList();
		Map<String, Object> model = new HashMap<String,Object>();
		model.put("itemList", itemList);
		// ModelAndView : �信 ������ ������ + ���̸� ����
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index"); // ���� �̸�. viewResolver �� ���� WEB-INF/jsp/index.jsp�� ���������� ���� 
		mav.addAllObjects(model);
		return mav;
	}
}
