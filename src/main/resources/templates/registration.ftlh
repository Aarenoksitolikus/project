<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Registration</title>
</head>
<body>
<div>
    <form method="post" action="/users/signup">
        <input type="text" name="email" placeholder="Email">
        <input type="text" name="firstName" placeholder="First Name">
        <input type="text" name="lastName" placeholder="Last Name">
        <input type="password" name="hashPassword" placeholder="Password">
        <input type="submit" value="Зарегистрироваться">
    </form>
</div>
</body>
</html>
