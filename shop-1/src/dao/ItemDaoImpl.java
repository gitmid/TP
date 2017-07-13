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
	// NamedParameterJdbcTemplate : 스프링 jdbc 관련 프레임워크 
	private NamedParameterJdbcTemplate template;
	public void setDataSource(DataSource dataSource){
		// dataSource : Connection 객체역할
		this.template = new NamedParameterJdbcTemplate(dataSource);
	}
	@Override
	public List<Item> findAll() {
		String sql = "select * from item";
		// column 이름과 프로퍼티 이름이 같은 경우 자동 매핑 
		RowMapper<Item> mapper = new BeanPropertyRowMapper<Item>(Item.class);
		return template.query(sql, mapper);
	}
	@Override
	public Item getItemById(Integer id) {
		String sql = "select * from item where id=:id";
		// column 이름과 프로퍼티 이름이 같은 경우 자동 매핑 
		// query의 결과를 Item 객체에 저장
		RowMapper<Item> mapper = new BeanPropertyRowMapper<Item>(Item.class);
		Map<String, Integer> paramMap = new HashMap<String, Integer>();
		paramMap.put("id", id);
		// queryForObject : 실행 결과가 한개인 경우, 객체 하나 리턴. RowMapper<T> 에 설정한 T객체
		return template.queryForObject(sql, paramMap, mapper);
	}
}
