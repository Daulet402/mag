package latin;

import latin.service.LatinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LatinController {

    @Autowired
    private LatinService latinService;

    @RequestMapping(method = RequestMethod.POST, value = "/latin")
    public String greeting(@RequestParam(value = "origin", required = false, defaultValue = "") String origin, Model model) {
        model.addAttribute("origin", origin);
        model.addAttribute("converted", latinService.convertToLatin(origin));
        return "latin";
    }
}
