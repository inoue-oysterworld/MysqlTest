package springbootsql;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/dummy")
	public String dummy() {
		return "dummy";
	}

	@RequestMapping("/search")
	public String search() {
		return "search";
	}

	@RequestMapping("/result")
	public String result() {
		return "result";
	}

}