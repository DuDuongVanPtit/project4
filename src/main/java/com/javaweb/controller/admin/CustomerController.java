//package com.javaweb.controller.admin;
//
//import com.javaweb.constant.SystemConstant;
//import com.javaweb.model.dto.UserDTO;
//import com.javaweb.utils.DisplayTagUtils;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.List;
//
//@Controller(value = "customersControllerOfAdmin")
//public class CustomerController {
//    @RequestMapping(value = "/admin/user-list", method = RequestMethod.GET)
//    public ModelAndView getNews(@ModelAttribute(SystemConstant.MODEL) UserDTO model, HttpServletRequest request) {
//        ModelAndView mav = new ModelAndView("admin/customer/list");
//        return mav;
//    }
//}
