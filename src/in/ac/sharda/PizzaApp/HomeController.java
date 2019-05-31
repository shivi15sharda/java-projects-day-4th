package in.ac.sharda.PizzaApp;


public class HomeController {

	@GetMapping("/")

	public Demo data() {
		Demo d = new Demo();
		d.setId(1);
		d.setEmail("abc");
		d.setName("snigdha");
		return d;

	}

	public String data1() {
		return "My Data";
	}

}
