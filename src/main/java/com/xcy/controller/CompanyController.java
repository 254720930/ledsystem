package com.xcy.controller;

import com.github.pagehelper.PageInfo;
import com.xcy.pojo.Article;
import com.xcy.pojo.Company;

import com.xcy.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
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

    @RequestMapping("/getCompsByTypeId/{mark}")
    public PageInfo getNewsByTypeId(@PathVariable("mark")int id, @RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "pageSize", required = true, defaultValue = "10") Integer pageSize){
        List<Article> compsList = companyService.getCompsByTypeId(id,page,pageSize);
        PageInfo pageInfo = new PageInfo(compsList);
        return pageInfo;
    }
}
