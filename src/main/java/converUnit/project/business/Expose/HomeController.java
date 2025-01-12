package converUnit.project.business.Expose;


import converUnit.project.business.Entities.Divisa;
import converUnit.project.business.service.DivisaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor
public class HomeController {



    @GetMapping("/home")
    public String home(){
        System.out.println("You enter to controller ");
        return "home";
    }

    @GetMapping("/basic")
    public String basic(){

        return "basic";
    }
}
