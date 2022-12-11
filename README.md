# ssm
ssm基本框架

# sql
```
create databases pay_order;
user pay_order;
CREATE TABLE `emp` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `depid` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3
```
本地启动项目步骤


0.拉代码 分支-master

1.创建mysql数据库

2.本地idea 添加tomcat 
![image](https://user-images.githubusercontent.com/23187572/206900229-c5fdea0c-5063-4634-bd6e-936d42d791ea.png)

3.tomcat 关联项目
![image](https://user-images.githubusercontent.com/23187572/206900248-934e6ba9-831f-4b81-a5e5-f5f7b61b5682.png)

4.启动tomcat 即可
