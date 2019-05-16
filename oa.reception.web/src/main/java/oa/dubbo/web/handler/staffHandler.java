package oa.dubbo.web.handler;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.liwenxiang.oa.dubbo.service.IStaffService;
import top.liwenxiang.oa.pojo.Staff;

import java.util.List;

@Controller
@RequestMapping("/dubbo")
public class staffHandler {

      @Reference
      IStaffService iStaffService;

      @RequestMapping("/list")
      public ModelAndView  getStaffData(){
             ModelAndView mv = new ModelAndView();
             List<Staff> allStaff = iStaffService.findAllStaff();
             mv.setViewName("/index.jsp");
             mv.addObject("list",allStaff);
             return mv;
      };

      @ExceptionHandler
      public String exceptionHandler(){
            return "/error.jsp";
      }



}
