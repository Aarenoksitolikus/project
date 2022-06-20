<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
</head>
<body>
<h2>Вход в систему</h2>
<form method="post" action="/login">
    <input id="username" name="username" type="text" placeholder="Email">
    <input id="password" name="password" type="password" placeholder="Password">
    <input type="submit" value="Login">
    <a href="/users/signup">Sign Up</a>
</form>
</body>
</html>
