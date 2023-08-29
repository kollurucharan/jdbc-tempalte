package template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Control {

	DAOInterface dc;

	@Autowired
	public Control(DAOInterface dc) {
		this.dc = dc;
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "crud";
	}

	@RequestMapping(value = "/first", method = RequestMethod.GET)
	@ResponseBody
	public ModelClass first() {

		ModelClass al = dc.first();
		return al;
	}

}
