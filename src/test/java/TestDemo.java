import com.qf.pojo.ArticleInfo;
import com.qf.service.ArticleInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestDemo {

    @Autowired
    ArticleInfoService articleInfoService;

    @Test
    public void getArticleInfoIdById(){
        ArticleInfo articleInfo=new ArticleInfo();
//        articleInfo.setContent("<p>你好3,</p><p><img src="http://192.168.2.37:8080/aaa/static/upload/02d66adc-3e59-4f89-91f8-47132136acda.JPG" style="max-width:100%;"><br></p>");

    }
}
