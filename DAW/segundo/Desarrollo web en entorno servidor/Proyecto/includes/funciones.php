<?php
function cambiarTema()
{
    if ($_COOKIE["tema"] == "light") {
        setcookie("tema", "dark");
        $_COOKIE["tema"] = "dark";
    } else {
        setcookie("tema", "light");
        $_COOKIE["tema"] = "light";
    }
}
if (isset($_POST["cambiarTema"])) {
    cambiarTema();
}
?>