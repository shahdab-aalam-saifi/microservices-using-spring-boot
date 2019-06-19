@RestController
public class HelloWorldController {
	@RequestMapping("/") 
	public String sayHello(){
		"Hello World!"
	}
}