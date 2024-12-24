package main.com.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

@Controller
public class HomeController
{

    @RequestMapping("/")
    public String showHomePage()
    {
        return "homePage";
    }

    @RequestMapping("/calcAge")
    public String showFormPage()
    {
        return "formPage";
    }

    @RequestMapping("/processForm")
    public String showResultForm(HttpServletRequest request, Model model){
        String yearVar = request.getParameter("year");
        String monthVar = request.getParameter("month");
        String dayVar = request.getParameter("day");

        long yearDif  = LocalDate.now().getYear() - Integer.parseInt(yearVar);
        long monthDif = LocalDate.now().getMonthValue() - Integer.parseInt(monthVar);
        long dayDif   = LocalDate.now().getDayOfMonth() - Integer.parseInt(dayVar);
        model.addAttribute("yearDOB", yearDif);
        model.addAttribute("monthDOB", monthDif);
        model.addAttribute("dayDOB", dayDif);
        return "resultPage";
    }
   /* @RequestMapping("/processForm")
    public String showResultForm(@RequestParam("year") String yearVar, Model model){

        model.addAttribute("yearDOB", yearVar);
        return "resultPage";
    }*/
}
