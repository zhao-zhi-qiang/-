package com.ygjy.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2020/6/2
 */

@RestController
public class DrugPurchaseController {

   @RequestMapping("/findUserByiD")
    public String findUserByiD(HttpServletRequest request, HttpServletResponse response, Integer id, Model model) {
        System.out.println("----------------------findUserByiD----------------------");
        return "index";
    }
}
