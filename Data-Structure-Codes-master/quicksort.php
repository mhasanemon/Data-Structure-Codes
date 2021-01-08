<?php

$array_to_sort = [1,4,2,9,6,2,7];

function quickSort(& $array,$left,$right){
    $i = $left;
    $j = $right;
    $pivot = $array[intval(($left+$right)/2)];

    while ($i<=$j){
        while ($array[$i]<$pivot){
            $i++;
        }

        while ($array[$j]>$pivot){
            $j--;
        }

        if ($i<=$j){
            $temp = $array[$i];
            $array[$i]=$array[$j];
            $array[$j] = $temp;
            $i++;
            $j--;
        }
    }

    if($left<$j){
        quickSort($array,$left,$j);
    }

    if($i<$right){
        quickSort($array,$i,$right);
    }
}

quickSort($array_to_sort,0,sizeof($array_to_sort)-1);

print_r($array_to_sort);

?>