<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UNOonline</title>
    <link rel="stylesheet" type="text/css" href="/css/style.x23532.css"/>
</head>
<body>
<div align="center">
<h1>UNOonline</h1>

<h2>Player list (player count : ${playerSize})</h2>
<table border="1px">
    <tr>
        <td>Name</td>
        <td>Id</td>
        <td>Delete player</td>
    </tr>
    <#list playerList as player>
        <tr>
            <td>${player.name}</td>
            <td>${player.id}</td>
            <td><a href="${'/wait/delete/'+player.id}"">Delete</a></td>
        </tr>
    </#list>
</table>
</body>
</html>