function solution(common) {
    var answer = 0;
    //등차수열
    if(common[2] - common[1] == common[1] - common[0]){
        answer =  common[common.length - 1] + (common[1] - common[0]);
    }else{ //등비수열
        answer = common[common.length - 1] * (common[1] / common[0]);
    }
    
    return answer;
}