<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
    <?php

        $num=$_POST['num'];
        $count=$_POST['count'];

        if (!isset($count)) {
           
            $count = 0;
        }
        if (isset($num)) {
            
            echo $count;
            
            echo '<form action="#" method="POST">
            Introduce otro numero: <input type="number" name="num">
            <input type="hidden" name="count" value"',$count,'">
            <input type="submit" value="Continuar">
            </form>';
            
        }

        else {
            
            echo '<form action="#" method="POST">
            Introduce el numero: <input type="number" name="num">
            <input type="submit" value="Continuar">
            </form>';
        }

    ?>
</body>
</html>