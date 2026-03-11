
void main(){
    int number = 7;
    IO.println(isOdd(number));
    if (isOdd(number)){
        IO.println(number+" ist ungerade");
    }
    else{IO.println(number+" ist gerade");}
}

boolean isOdd(int number){return (number%2==0) ? false:true;}