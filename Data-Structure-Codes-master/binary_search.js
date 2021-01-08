var scanf = require('scanf');
 
var values = [];

console.log('Pleas input the length:');
var length = scanf('%d');

for(var i=0;i<length;i++){
    console.log('Pleas input the value no :'+(i+1));
    values[i] = scanf('%d');
    
}

console.log('Enter the value to search for:');
var val = scanf('%d');

values.sort(function(a, b){return a - b});

var BEG = 0;
var END = length-1;
var POS = -1;


while(BEG<=END){
    var MID = (BEG+END)/2;
    if(values[MID]==val){
        POS = MID;
        break;
    }
    else if(val<values[MID]){
        END = MID -1;
    }
    else if(val>values[MID]){
        BEG = MID +1;
    }

}

if(POS!=-1){
    console.log("Value found at position "+(POS+1));
}
else{
    console.log("Value not found!")
}
