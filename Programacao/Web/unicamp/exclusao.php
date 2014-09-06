<?php
include ('conexao.php');

$email = $_GET['email'];
echo ($email);

$deletar = mysql_query("DELETE FROM funcionarios WHERE email = '$email' ") or die ("lalalaal");

header("Location:alterar.php");










?>