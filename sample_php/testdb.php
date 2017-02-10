<h1> Test DATABASE </h1>
This page tests if php-mysql works.
It should display a list of author names
<ul>
<?php
	$conn = mysql_connect("localhost", "root", "goodyear123!@#");
	if(!$conn){
		die("db conn error". mysql_error());
	}
	mysql_select_db("lib_db", $conn);
	$q = "SELECT name FROM authors";
	$res = mysql_query($q, $conn);
	if(!$res){
		die("db err ".mysql_error());
	}
	while($row=mysql_fetch_assoc($res)){
		echo("<li>".$row["name"]."</li>");
	}

	
?>
</ul>
