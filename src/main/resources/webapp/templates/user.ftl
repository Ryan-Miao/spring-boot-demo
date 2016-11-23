<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User</title>
</head>
<body>
This is xss: ${xss!'null'}
<hr/>
This is a freemarker template. You can choose any template you like.
<hr/>
Hi, My name is  ${user.name}! I'm ${user.age} yeas old, and I'm a ${user.sex}.
<hr/>


error:<br/>
<#if error??>
    <#list error as e>
        <span>${e.defaultMessage}</span>
        </br>
    </#list>
</#if>
</body>
</html>