spring-boot demo
===============

#configure
- maven
- spring-boot
- thymeleaf
- freemarker
- security
- static resource
- profile

# how to run
cmd到当前目录，然后运行：
> mvn spring-boot:run   

运行成功后浏览器访问：
> http://localhost:8080/

debug：
```
mvn spring-boot:run -Drun.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005"
而后，在idea中选择  Run-> Edit Configuration -> + -> remote -> apply
```

其他运行方式：直接运行：
> hello.Application.main方法即可，debug同样可以。



# about setting
1. java文件位于src/main/java下。
2. 配置文件位于src/main/resources下。
3. 静态文件可以放在webapp下，url访问方式为:    
> /a.html   or  /test/c.html   

4. 静态文件还可以放在src/main/resources/webapp/static下，url访问方式为:   
> /webapp/static/js/jquery/jquery-1.12.0.min.js   or  /webapp/static/hello.html   

5. 模板文件根据后缀来判断模板类型。html为thymeleaf，ftl为freemarker，jsp为jsp。
模板文件放在src/main/resources/templates下，在controller中render方式为:    
> return "user";  //表示render user.ftl    

6. 配文件为:    
>  src/main/resources/application.yml application-dev.yml   

7. 配置拦截器的位置：
> src/main/java/hello/interceptor/xxxx   and  src/main/java/config/ServletContextConfig





   
   

