
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Consultar</title>
</head>


<body bgcolor="#669999" text="#3300CC" >



<table width="649" height="775" border="3%" align="center">
<tr>
 <td width="583" height="102"><center><h1>Bem vindo a consulta</h1></center>
</tr>
<tr>
 <td height="43"><center><h3>Digite o nome para consulta</h3></center>
</tr>
<tr >
 <td height="616" valign="top"><br><br>
 
 <br>
  <br>
   <br>
    <br>
 <center>Nome:</center>    
 <br>
<form method="post" action="consulta.php">    
     
<center><input type="text" name="nome_cons" size="40" ><br><br>
              <input type="submit" value="Enviar" ></center>
           
 				
 
 </form>
 <br>
<br>
<table width="580" height="28"  align="center" cellpadding="3" cellspacing="20">

  <tr>
    <td width="120" height="22" bgcolor="#999999">Nome:</td>
   <td width="150" bgcolor="#999999"> 
    <?php
	include ('conexao.php');
	if ($_POST){
    $check = $_POST["nome_cons"];
	$existe = false;
	$teste = "testando";
	
	
	$checar = mysql_query("SELECT * FROM funcionarios");
	
	while($linha = mysql_fetch_array($checar)){
		
		$pega_nome = $linha["nome"];
		
		 if ($check == $pega_nome){
			 
			 $existe=true;

			 
			                                  }
		
		
		                                                          }
	
		
		if ($check!=NULL){
		echo ($check);
		}
	
	}
	?>
    
    </td>
    <td width="141" bgcolor="#999999">Esta registrado?</td>
    <td width="141" bgcolor="#999999">
    <?php
if ($_POST){	
	
	if ($existe == true)
{
	echo ("Sim");

	
	}else{echo ("Não");}
    
    
}
    
    
    ?>
    
    </td>
  </tr>
</table>
 </tr>





</table>



	





</body>
</html>
