package com.liumapp.datapay.face;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.qtools.file.base64.Base64FileTool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * file FaceOperatorTest.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/28
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {FaceOperatorMain.class})
public class FaceOperatorTest {

    private boolean debug = false;

    private String datapath = "/usr/local/tomcat/project/datapay-operator/data/";

    @Autowired
    private FaceOperator faceOperator;

    @Test
    public void testHandle () throws Exception {
        if (debug) {
            JSONObject result = faceOperator.handle("姓名","身份证号码", Base64FileTool.filePathToBase64("生活照存储路径"));
            System.out.println(result.toJSONString());
        }
    }

}
