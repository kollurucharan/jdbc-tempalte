package template;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class DAOClass implements DAOInterface {

	JdbcTemplate jt;

	@Autowired
	public DAOClass(DataSource ds) {
		jt = new JdbcTemplate(ds);
	}

	public ModelClass first() {
		return jt.queryForObject("select * from empp_pp limit 1;", new JTRowMap());
	}

}
