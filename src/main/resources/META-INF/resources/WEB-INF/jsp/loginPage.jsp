<html>
    <head>
        <link href="webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet"/>
        <title>LOGIN page</title>
    </head>
    <body>
        <div class="container">
            <h1>Welcome to LOGIN!</h1>
            <pre>${errorMessage}</pre>
            <form method="post">
                Name: <input type="text" name="name" />
                PassWord: <input type="password" name="password"/>
                <input type="submit" />
            </form>
        </div>

        <script src="webjars/bootstrap/5.3.0/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.4/jquery.min.js"></script>
    </body>
</html>