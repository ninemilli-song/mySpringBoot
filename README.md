# Spring Boot Demo

## 参照地址： 

https://www.cnblogs.com/quanxi/p/7147071.html

## 遇到问题：
1. `Unable to start ServletWebServerApplicationContext due to missing ServletWebServerFactory bean`

    解决方法：在main方法的类上面加上一个@EnableAutoConfiguration注解
    
