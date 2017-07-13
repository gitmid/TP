package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import logic.Item;


public class ItemDaoImpl implements ItemDao {
	// NamedParameterJdbcTemplate : ������ jdbc ���� �����ӿ�ũ 
	private NamedParameterJdbcTemplate template;
	public void setDataSource(DataSource dataSource){
		// dataSource : Connection ��ü����
		this.template = new NamedParameterJdbcTemplate(dataSource);
	}
	@Override
	public List<Item> findAll() {
		String sql = "select * from item";
		// column �̸��� ������Ƽ �̸��� ���� ��� �ڵ� ���� 
		RowMapper<Item> mapper = new BeanPropertyRowMapper<Item>(Item.class);
		return template.query(sql, mapper);
	}
	@Override
	public Item getItemById(Integer id) {
		String sql = "select * from item where id=:id";
		// column �̸��� ������Ƽ �̸��� ���� ��� �ڵ� ���� 
		// query�� ����� Item ��ü�� ����
		RowMapper<Item> mapper = new BeanPropertyRowMapper<Item>(Item.class);
		Map<String, Integer> paramMap = new HashMap<String, Integer>();
		paramMap.put("id", id);
		// queryForObject : ���� ����� �Ѱ��� ���, ��ü �ϳ� ����. RowMapper<T> �� ������ T��ü
		return template.queryForObject(sql, paramMap, mapper);
	}
}
