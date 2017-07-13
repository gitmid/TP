package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import logic.Item;
import logic.ShopService;

// ��Ʈ�ѷ� �������̽� ������� @��� ��� 
// @Controller : Controller ����� �ϴ� Ŭ����  
@Controller
public class DetailController {
	private ShopService shopService;
	public void setShopService(ShopService shopService){
		this.shopService = shopService;
	}
	
	// ��û�� ȣ��Ǵ� �޼��� (handleRequest ����) 
	@RequestMapping
	public ModelAndView detailItem(Integer id){ // �Ű����� �̸��� �Ķ���� �̸��� ������ �ڵ����� ���� (id�Ű������� id�̸��� �Ķ���Ͱ�) , request��ü�� �ʿ��ϸ� �Ű������� ���ָ� ���޹��� �� ����
		// �Ķ���Ͱ��� �⺻ String������ ����. 
		// Integer ���·� ������ �ڵ� ����ȯ�� ����.(int�δ� ���Ұ�, String���� ����ȯ�ؼ� �޾ƾ��ϱ⶧����) 
		Item item = shopService.getItemById(id);
		ModelAndView mav = new ModelAndView("detail"); // ����+�̸����� 
		mav.addObject("item",item);
		return mav;
	}
}
