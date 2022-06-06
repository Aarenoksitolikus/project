<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Users</title>
    <link rel="icon"
          href="https://w7.pngwing.com/pngs/866/64/png-transparent-computer-icons-id-card-text-rectangle-area-thumbnail.png">
</head>
<body>
Hello, ${user.firstName} ${user.lastName}!
<p>
    <#if user.hashPassword??> <#--user.hashPassword != null-->
        Your hashPassword is ${user.hashPassword}
    <#else>
        Your hashPassword is undefined
    </#if>
</p>
<p>
    ${user_from_db}
</p>
<p>
    Other users:
<ul>
    <#if users??>
        <#list users as current>
            <li>
                ID: ${current.id}
                First Name: ${current.firstName}
                Last Name: ${current.lastName}
            </li>
        </#list>
    </#if>
</ul>
</p>
</body>
</html>


