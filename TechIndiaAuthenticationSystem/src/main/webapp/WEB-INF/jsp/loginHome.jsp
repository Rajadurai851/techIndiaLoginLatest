<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello ${name}!</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>

<form action="${contextPath}/validate" method="post">  
UserName : <input type="text" name="username"/> <br><br>   
Password : <input type="text" name="password"/> <br><br>   
<input type="submit" name="submit">  
</form>  

</body>
</html>



