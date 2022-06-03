Hello, ${user.firstName} ${user.lastName}!
<p></p>
<#if user.hashPassword??> <#--user.hashPassword != null-->
    Your hashPassword is ${user.hashPassword}
<#else>
    Your hashPassword is undefined
</#if>
<p></p>

Other users:
<#if users??>
    <#list users as current>
        First Name: ${current.firstName}
        Last Name: ${current.lastName}
    </#list>
</#if>


