package com.xcy.mapper;

import com.xcy.pojo.Article;
import com.xcy.pojo.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CompanyMapper {

    List<Company> companyList();

    List<Article> articleList();

    List<Article> getCompsByTypeId(int id);
}
