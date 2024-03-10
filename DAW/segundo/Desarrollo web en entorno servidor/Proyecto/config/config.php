<?php
define('USER', 'dwes');
define('PASSWORD', 'abc123.');
define('HOST', '10.147.20.155');
define('DATABASE', 'tienda_videojuegos');
try {
    $connection = new PDO("mysql:host=" . HOST . ";dbname=" . DATABASE, USER, PASSWORD);
    $connection->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    exit("Error: " . $e->getMessage());
}
?>