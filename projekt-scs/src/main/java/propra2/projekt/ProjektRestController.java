package propra2.projekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProjektRestController {
    @Autowired
    ProjektRepository projektRepository;

    @GetMapping("/projekte-rest/all")
    public Projekt all() {
        Optional<Projekt> projekts = projektRepository.findById(new Long(1));
        return projekts.get();
    }
}
