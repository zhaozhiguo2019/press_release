package com.qf.service.impl;

import com.qf.dao.ArticleInfoMapper;
import com.qf.pojo.ArticleInfo;
import com.qf.service.ArticleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ArticleInfoServiceImpl implements ArticleInfoService {

    @Autowired
    ArticleInfoMapper articleInfoMapper;

    public ArticleInfo getReleaseInfoById(int articleId) {
        return articleInfoMapper.getReleaseInfoById(articleId);
    }

    public boolean commitArticle(ArticleInfo articleInfo) {
        return articleInfoMapper.commitArticle(articleInfo)>0;
    }

    public ArticleInfo getArticleInfoIdById(ArticleInfo articleInfo) {
        return articleInfoMapper.getArticleInfoIdById(articleInfo);
    }
}
