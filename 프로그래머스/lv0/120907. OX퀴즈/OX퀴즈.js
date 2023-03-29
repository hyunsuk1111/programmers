function solution(quiz) {
    var answer = [];
    let j;
    
    for(let i = 0; i < quiz.length; i++){
        let result = 0;
        j = quiz[i].split(" ");        
        
        if(j[1] === "+"){
            result = parseInt(j[0]) + parseInt(j[2]);
        }else{
            result = parseInt(j[0]) - parseInt(j[2]);
        }
        
        result == j[4] ? answer.push("O") : answer.push("X");
    }
    
    
    
    return answer;
}