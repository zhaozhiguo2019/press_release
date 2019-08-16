package com.qf.pojo;



import lombok.Data;

import java.sql.Timestamp;


@Data
public class ArticleInfo {
    int articleId;
    int areaId;
    int userId;
    String articleName;
    long typeId;
    String mainTitle;
    String subTitle;
    String content;
    int status;
    Timestamp creatTime;
    Timestamp updateTime;

}
