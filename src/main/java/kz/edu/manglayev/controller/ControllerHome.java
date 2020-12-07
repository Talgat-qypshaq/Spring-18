package kz.edu.manglayev.controller;

import kz.edu.manglayev.dao.SheetsDAO;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
public class ControllerHome
{

    private final SheetsDAO sheetsDAO;
    @Autowired
    public ControllerHome(SheetsDAO sheetsDAO)
    {
        this.sheetsDAO = sheetsDAO;
    }

    @GetMapping()
    public String homePage(Model model)
    {
        model.addAttribute("message", sheetsDAO.getData());
        return "home";
    }
}