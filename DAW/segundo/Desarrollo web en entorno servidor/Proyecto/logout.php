<?php
session_start();
session_unset();
session_destroy();
setcookie(session_name(), '', -1);
header("Location:index.php");
?>