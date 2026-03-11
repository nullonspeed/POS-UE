void main() {
    IO.println(fib_naiv(6));
}
long fib_naiv(int n){
    if(n<=2){
        return 1;
    }
    else{
       return fib_naiv(n-2)+fib_naiv(n-1);
    }
}

long fib(int n){
    return fib_rec(n, 1, 1);
}
long fib_rec(int n, int f1, int f2){
    if (n<=1){
        return f1;
    }
    else{
        return fib_rec(n-1, f2, f1+f2);
    }
}

