package cours.ugb.hospitalapi.controller;



import cours.ugb.hospitalapi.dao.ClasseRepository;
import cours.ugb.hospitalapi.model.Classe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/classe")
public class ClasseController {
    @Autowired
    private ClasseRepository classeRepository;
    @GetMapping("/")
    @ResponseBody
    public List<Classe> index(){
      return classeRepository.findAll() ;
    }

    @GetMapping("/edit/{id}")
    @ResponseBody
    public Classe edit(@PathVariable("id")  long id , Model model){
        Optional<Classe> cl=classeRepository.findById(id);
        if (cl.isPresent()){
            return  cl.get();
        }
        return new  Classe();
    }
    @PostMapping("/add")
    public  Classe add(@RequestBody Classe c)
    {
        return classeRepository.save(c);
    }

}
