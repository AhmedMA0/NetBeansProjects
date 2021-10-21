<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
    </head>
<body>
    <?php

        $num = $_POST['num'];
        $total = $_POST['total'];
        $count = $_POST['count'];
        $pares = $_POST['pares'];
        $media = 0;

        if ($num >= 0) {
            
            //los numero pares introducidos no afectan en nada a la media de los pares por eso el contador solo suma 1 si el numeor introducido es impar
            if ($num%2==0) {
                if ($num > $pares) {
                    $pares = $num;
                }
            }

            else {
                $total += $num;
                ++$count;
            }

    ?>
            <form action="ejer21_1.php" method="post">
            <input type="hidden" name="total" value="<?php echo $total; ?>">
            <input type="hidden" name="count" value="<?php echo $count; ?>">
            <input type="hidden" name="pares" value="<?php echo $pares; ?>">
            <input type="submit" value="Continuar">
            </form><?php
        }

        else {

            $media = $total / $count;
            echo "Número negativo introducido, la media de los pares es de: ", $total, " entre ", $count, " = ", $media,
            '<br>' , 'El mayo numero par introducido es: '. $pares;

        }
    ?>
</body>
</html>