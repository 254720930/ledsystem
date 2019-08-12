package com.xcy.service;

import com.xcy.pojo.Article;
import com.xcy.pojo.Company;

import java.util.List;

public interface CompanyService {

    List<Company> companyList();

    List<Article> articleList();

    List<Article> getCompsByTypeId(int id, Integer page, Integer pageSize);
}
