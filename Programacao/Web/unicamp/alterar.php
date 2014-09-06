<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Alteração</title>
<script language="javascript">
function certeza (form){
	
var r = confirm ("Tem certeza que deseja excluir este registro?");

if (r == true){
	
	document.forms["formulario"].submit();
	
	alert ("Registro excluido \n  obs :  Somente dados registrados podem ser excluidos");
	
	}
	
	
	}
	
function alterou(){
	
	alert ("Alteração realizada \n  obs :  Somente dados registrados podem ser modificados");
	
	
	}

</script>
</head>

<body bgcolor="#669999" text="#3300CC" >
<?php include ("conexao.php");
$nome_2 = NULL;
$telefone_2 = NULL;
$unidade_2 = NULL;
$email_2 = NULL;
$cargo_2 = NULL;
$id_2 = NULL;


 ?>


<table width="649" height="764" border="3%" align="center">
  <tr>
 <td width="583" height="102"><center><h1>Bem vindo a alteração</h1></center>
</tr>
<tr>
 <td height="43"><center><h3>Digite o e-mail para alterar o cadastro</h3></center>
</tr>
<tr >
 <td height="259" valign="top"><br><br>
 
 <br>
  <br>
   <br>
    <br>
 <center>Email:</center>    
 <br>
<form method="post" action="alterar.php">    
     
<center><input type="text" name="email_alt" size="40" ><br><br>
              <input type="submit" value="Enviar" ></center>
           
 				
 
 </form>
 
 <?php 
 
 
 if ($_POST){
	 $email = $_POST["email_alt"];
	 

	 
$puxando = mysql_query("SELECT * FROM funcionarios WHERE email='$email' ")  ;  
	 
	if ($separando = mysql_fetch_array($puxando)){
		
		$nome_2 = $separando["nome"];
		$telefone_2 = $separando["telefone"];
		$unidade_2 = $separando["unidade"];
		$email_2 = $separando["email"];
		$cargo_2 = $separando["cargo"];
		$id_2 = $separando["id"];
		
		
		
		
		}else {$nome_2 = "Não Cadastrado";
		          $telefone_2 = "Não Cadastrado";
		          $unidade_2 = "Não Cadastrado";
		          $email_2 = "Não Cadastrado";
		          $cargo_2 = "Não Cadastrado";
		          $id_2 = "Não Cadastrado";}
	 
	 
	 
	 
	 
	 
	 }
 
  ?>
 
 </td>
 <tr>
 <td height="66">
 
 <table >
 <form method="get" action="alterar.php">
 <td ><center>Nome</center>
 <input type="text" name="nome_edit" size="30" value = "<?php if ($nome_2 != NULL){echo ($nome_2) ;}  ?>">
 <td ><center>Telefone</center>
 <input type="text" name="telefone_edit" size="30" value = "<?php if ($telefone_2 != NULL){echo ($telefone_2); } ?>" >
<td ><center>Unidade</center>
 <input type="text" name="unidade_edit" size="30" value = "<?php if ($unidade_2 != NULL){echo ($unidade_2);} ?>" >
<td ><center>E-mail</center>
 <input type="text" name="email_edit" size="30" value = "<?php if ($email_2 != NULL){echo ($email_2); } ?>" >
 <td ><center>Cargo</center>
 <input type="text" name="cargo_edit" size="30" value = "<?php if ($cargo_2 != NULL){echo ($cargo_2); } ?>" >
 <input type="hidden" name="id_edit" value="<?php if ($id_2 != NULL){echo ($id_2); } ?>">
  
 </table>
 
 
 
 </td>
 </tr>
 <tr>
 <td height="276" valign="top"><center><input type="submit" value="Alterar" onclick = "alterou()" ></center>
 </form>
 <form method="get" action="exclusao.php" id="formulario">
 <input type="hidden" name="email" value="<?php if ($email_2 != NULL){echo ($email_2); } ?>">
<center><input type="button" value="Excluir" onclick="certeza(confirma.form)" name="confirma" ></center>
</form>
 
 </tr>
 
 <br>
<br>
</table>

<?php

if ($_GET){
	
	$nome_edit = $_GET['nome_edit'];
	$telefone_edit = $_GET['telefone_edit'];
	$unidade_edit = $_GET['unidade_edit'];
	$email_edit = $_GET['email_edit'];
	$cargo_edit = $_GET['cargo_edit'];
	$id_edit = $_GET['id_edit'];
	
	
	
	
    $sql_alterar = mysql_query("UPDATE funcionarios SET nome='$nome_edit', email='$email_edit', unidade='$unidade_edit', cargo='$cargo_edit' , telefone = '$telefone_edit' WHERE id = '$id_edit'");
	
	
	
	
	
	
	
	
	}









 ?>


</body>
</html>