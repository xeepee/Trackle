package com.gas.trackle.service;

import com.gas.trackle.domain.Article;

import java.util.List;

public interface ArticleService {

    List<Article> findTop10News();
}
