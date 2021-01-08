
<?php

//Merge Sort

//Code implemented from Java lab code
$array_to_sort = [1,6,2,7,2,4,9];

function mergeSort(& $array,$left,$right){
    $mid = intval(($left+$right)/2);

    if($left<$right){
        mergeSort($array,$left,$mid);

        mergeSort($array,$mid+1,$right);

        merge($array,$left,$mid,$right);
    }

}

function merge(& $array,$left,$mid,$right){

    $temp_array = [];

    $pos = 0;
    $lpos = $left;
    $rpos = $mid+1;

    while ($lpos<=$mid && $rpos <= $right){
        if($array[$lpos]<$array[$rpos]){
            $temp_array[$pos++] = $array[$lpos++];
        }

        else {
            $temp_array[$pos++] = $array[$rpos++];
        }
    }

    while ($lpos<=$mid){
        $temp_array[$pos++]=$array[$lpos++];
    }

    while ($rpos<=$right){
        $temp_array[$pos++]=$array[$rpos++];
    }

    for ($i  = 0;$i<$pos;$i++){
        $array[$i+$left] = $temp_array[$i];
    }

}
echo "Array Before sort: ";
print_r($array_to_sort);
mergeSort($array_to_sort,0,sizeof($array_to_sort)-1);

echo "\nArray After Sort: ";
print_r($array_to_sort);

?>