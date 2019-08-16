package com.qf.service;


import com.qf.pojo.ArticleInfo;

public interface ArticleInfoService {
    public ArticleInfo getReleaseInfoById(int articleId);

    public boolean commitArticle(ArticleInfo articleInfo);

    public ArticleInfo getArticleInfoIdById(ArticleInfo articleInfo);
}
