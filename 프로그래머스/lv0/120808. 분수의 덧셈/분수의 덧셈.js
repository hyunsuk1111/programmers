function solution(numer1, denom1, numer2, denom2) {    
    let num1 = (denom1 * numer2) + (numer1 * denom2);    
    let num2 = (denom1 * denom2);
    let maximum = 1
    
    for(let i = 1 ; i <= num1 ; i ++) {
        if((num1 % i == 0) && (num2 % i == 0)) {
            maximum = i
        }
    }
    
     return [num1/maximum, num2/maximum];
}