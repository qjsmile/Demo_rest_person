package person;
import java.util.concurrent.atomic.AtomicLong;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.bind.annotation.ResponseBody; 

@Controller
public class PersonInfController { 
	    private final AtomicLong counter = new AtomicLong();  
	  
	    @RequestMapping("/personinf")  
	    public @ResponseBody PersonInf personinf(  
	            @RequestParam(value="name", required=false, defaultValue="ximing") String name,
	            @RequestParam(value="age", required=false, defaultValue="12") int age) {  
	        return new PersonInf(counter.incrementAndGet(),name,age);  
	    }
}
