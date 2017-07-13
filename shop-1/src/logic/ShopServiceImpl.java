package logic;

import java.util.List;

import dao.ItemDao;

public class ShopServiceImpl implements ShopService {
	private ItemDao dao;
	public void setItemDao(ItemDao dao){
		this.dao = dao;
	}
	@Override
	public List<Item> getItemList() {
		return dao.findAll();
	}
	@Override
	public Item getItemById(Integer id) {
		return dao.getItemById(id);
	}
}
