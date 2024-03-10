<?php
function cambiarTema()
{
    $_COOKIE["tema"] == "light" ? setcookie("tema", "dark") : setcookie("tema", "light");
}
?>
<header class="row justify-content-between align-items-center g-2">
    <div class="col">
        <h1>Tienda de videojuegos</h1>
    </div>
    <div class="col">
        <button type="button" class="btn btn-primary" data-bs-toggle="button" aria-pressed="false" autocomplete="off">Button</button>
    </div>
</header>