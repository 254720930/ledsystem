package com.xcy.service.impl;

import com.github.pagehelper.PageHelper;
import com.xcy.mapper.CompanyMapper;
import com.xcy.pojo.Article;
import com.xcy.pojo.Company;
import com.xcy.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImp implements CompanyService {

    @Autowired
    CompanyMapper companyMapper;
    @Override
    public List<Company> companyList() {
        List<Company> companyList = companyMapper.companyList();
        return companyList;
    }

    @Override
    public List<Article> articleList() {
        List<Article> ArticleList = companyMapper.articleList();
        return ArticleList;
    }

    @Override
    public List<Article> getCompsByTypeId(int id, Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        List<Article> compsList =companyMapper.getCompsByTypeId(id);
        return compsList;
    }
}
