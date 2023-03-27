package training.com.training1;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import training.com.utility.ConstFuncStr;
import training.com.utility.ConstMappings;

//import org.springframework.web.bind.annotation.GetMapping;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author supradip
 *
 */
@RestController
public class POAgileCoach {
//@RequestMapping("/devtraining")
@RequestMapping(ConstMappings.devTrainingMapStr)
public String index() {

    return ConstFuncStr.devTrainingStr;
//return "Hello - GD & training for Developers of Cybage on Domain Driven design & Microservice Architecture by 18th Feb 2023 !!!!!!!!";
}

//@RequestMapping("/scrumtraining")
@RequestMapping(ConstMappings.scrumTrainingMapStr)
public String scrumtraining() {

    return ConstFuncStr.scrumTrainingStr;
//return "Hello - GD & training on Basic Agile & Scrum for Project & Program Managers of Cybage by 1st May 2023!!!!!!";

}  
  
}
