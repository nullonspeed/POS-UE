enum CharacterType{
    DIGIT, LETTER, PUNCTUATION, OTHER;
}

void main(){
 IO.println(chartType('a'));  
 
 IO.println(chartType('1'));
 
 IO.println(chartType('.'));
}

CharacterType chartType(char ch){
    if(ch >= '0' && ch <= '9') return CharacterType.DIGIT;
    if(ch >= 'a'&& ch <= 'z' || ch >= 'A' && ch <= 'Z'){
        return CharacterType.LETTER;
    } 
    else return CharacterType.OTHER;
}


