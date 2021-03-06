# datapay-operator
China data pay api operator .
数据宝六类API的Spring Boot操作工具类

## 简介

* bankcard-operator

    银行卡四要素认证
    
    根据姓名、身份证号码、银行卡号码、手机号码进行匹配查询，如果全部符合，则返回正确结果
    
    具体使用方式，请见bankcard-operator的[README.md](https://github.com/liumapp/datapay-operator/tree/master/bankcard-operator)
    
* face-operator

    人像比对
    
    根据姓名、身份证号码、包含人脸的生活照进行比对，返回生活照上的人脸与证件照上的人脸比对得分（最高分为1.0）
    
    证件照照片根据姓名和身份证号码得来
    
    具体使用方式，请见face-operator的[README.md](https://github.com/liumapp/datapay-operator/tree/master/face-operator)
    
* government-operator

    企业工商基础信息核验
    
    根据企业名称返回企业工商信息详情
    
    具体使用方式，请见government-operator的[README.md](https://github.com/liumapp/datapay-operator/tree/master/government-operator)
    
* ocr-operator

    身份证OCR识别
    
    根据身份证图片的Base64值返回证件信息
    
    具体使用方式，请见ocr-operator的[README.md](https://github.com/liumapp/datapay-operator/tree/master/ocr-operator)
    
* phone-operator

    全网手机三要素验证
    
    根据姓名、身份证号码、手机号码进行匹配查询，如果全部符合，则返回正确
    
    具体使用方式，请见phone-operator的[README.md](https://github.com/liumapp/datapay-operator/tree/master/phone-operator)
    
* realname-operator

    实名认证
    
    根据姓名、身份证号码进行匹配查询，如果全部符合，返回正确
    
    具体使用方式，请见realname-operator的[README.md](https://github.com/liumapp/datapay-operator/tree/master/realname-operator)
    
    
    












 
