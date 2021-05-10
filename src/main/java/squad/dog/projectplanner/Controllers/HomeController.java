package squad.dog.projectplanner.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import squad.dog.projectplanner.Models.data.ProjectRepository;

@Controller
public class HomeController {

    @Autowired
    private ProjectRepository projectRepository;

    @RequestMapping("")
    public String index(Model model){
        model.addAttribute("projects", projectRepository.findAll());
        return "index";
    }//index


}//HomeController
