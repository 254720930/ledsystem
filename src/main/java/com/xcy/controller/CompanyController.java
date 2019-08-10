package com.xcy.controller;

import com.xcy.pojo.Article;
import com.xcy.pojo.Company;
import com.xcy.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/comp")
public class CompanyController {

    @Autowired
    CompanyService companyService;
    @RequestMapping("/showCompany")
    public String showCompany(){
        return "behind/company";
    }
    @RequestMapping("/companyList")
    @ResponseBody
    public List<Company> companyList(){
        List<Company> companyList = companyService.companyList();
        return companyList;
    }
    @RequestMapping("/articleList")
    @ResponseBody
    public List<Article> articleList(){
        List<Article> companyList = companyService.articleList();
        return companyList;
    }
}
