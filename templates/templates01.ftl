欢迎您:${username}

<#-- list循环遍历指令 -->
<#list numbers as number>
    <#-- if分支指令 -->
    <#if number < 3>
        <#-- 取值的方式 -->
        ${number}是偶数;
        <#else>
        ${number}是奇数;
    </#if>
</#list>