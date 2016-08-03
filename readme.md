spring-boot demo
===============

#configure
- maven
- spring-boot
- thymeleaf
- security
- static
- profile
- freemarker

# about setting
1. java文件位于src/main/java下。
2. 配置文件位于src/main/resources下。
3. 静态文件可以放在webapp下，url访问方式为:    
> /a.html   or  /test/c.html   
4. 静态文件还可以放在src/main/resources/static下，url访问方式为:   
> /static/js/jquery/jquery-1.12.0.min.js   or  /static/hello.html   
5. 模板文件根据后缀来判断模板类型。html为thymeleaf，ftl为freemarker，jsp为jsp。
模板文件放在src/main/resources/templates下，在controller中render方式为：    
>  return "user";  //表示render user.ftl   

