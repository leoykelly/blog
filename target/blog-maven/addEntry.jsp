<%--
  Created by IntelliJ IDEA.
  User: Kelly
  Date: 4/5/2017
  Time: 1:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Post</title>
    <link rel="stylesheet" type="text/css" media="all" href="css/theme.css" />
    <link rel="stylesheet" type="text/css" media="all" href="css/registration.css" />
</head>
<body>
<section>
    <header>Post!</header>
    <form>


        <label>Blog Name:</label>
        <input type="text" />

        <br /><br />
        <label>Date:</label>
        <input type="date" />

        <br /><br />
        <label>Content:</label>
        <input type="textarea" />

        <br /><br />
        <input type="submit" value="Add Post" class="backButton" />

        <br /><br /><br /><br />

    <article class="row">
        <a href="/blog-maven" class="backButton">Home</a>
    </article>
    </form>
</section>

</body>
</html>