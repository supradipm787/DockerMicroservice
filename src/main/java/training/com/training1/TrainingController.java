package training.com.training1;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author manoj.bardhan
 *
 */
@RestController
public class TrainingController {
@RequestMapping("/devtraining")
public String index() {
return "Hello - training for Developer 16th July 2021 !!!";
}

@RequestMapping("/scrumtraining")
public String scrumtraining() {
return "Hello - training for Scrum Masters  16th July 2021 !!!";
}  
  
}
