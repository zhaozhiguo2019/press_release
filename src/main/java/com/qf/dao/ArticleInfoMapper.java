package com.qf.dao;


import com.qf.pojo.ArticleInfo;

public interface ArticleInfoMapper {

    public ArticleInfo getReleaseInfoById(int releaseId);

    public int commitArticle(ArticleInfo articleInfo);

    public ArticleInfo getArticleInfoIdById(ArticleInfo articleInfo);
}
