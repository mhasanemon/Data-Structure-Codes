var scanf = require('scanf');
 
var values = [];

console.log('Pleas input the length:');
var length = scanf('%d');

for(var i=0;i<length;i++){
    console.log('Pleas input the value no :'+(i+1));
    values[i] = scanf('%d');
    
}

for(var i = 0;i<length;i++){
    var index_min = i;

    for(var j=i+1;j<length;j++){
        if(values[j]<values[index_min]){
            index_min = j;
        }
    }

    if(index_min!=i){
        var temp = values[i];
        values[i]=values[index_min];
        values[index_min] = temp;
    }

}

for(var i=0;i<length;i++){
    console.log(values[i]+" ");
}