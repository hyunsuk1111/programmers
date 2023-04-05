function solution(polynomial) {
    var answer = '';
    let temp = polynomial.split(' + ');
    let num1 = 0;
    let num2 = 0;
     
    for(let i = 0; i < temp.length; i++){
        if(temp[i].includes('x')){
            const str = temp[i].replace("x", "") || "1";
            num1 += parseInt(str, 10);
        }else{
            num2 += parseInt(temp[i]);
        }
    }    
    let temp2 = [];
    
    if(num1){
        temp2.push(`${num1 === 1 ? "" : num1}x`);
    }
    if(num2){
        temp2.push(num2);
    }
    
    return temp2.join(" + ");
}