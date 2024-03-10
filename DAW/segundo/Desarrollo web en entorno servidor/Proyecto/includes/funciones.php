<?php
function cambiarTema()
{
    $_COOKIE["tema"] == "light" ? setcookie("tema", "dark") : setcookie("tema", "light");
}
if (isset($_POST["cambiarTema"])) {
    cambiarTema();
    header("Refresh:0");
}
?>