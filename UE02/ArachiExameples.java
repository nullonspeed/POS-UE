void main(){
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,3,4};
    printVector(arr1);
    printVector(arr2);
    IO.println(scalarProduct(arr1, arr2));
}
void printVector(int[]v){
    for (int value : v){
        IO.print(value);
    }
    IO.println();
}
int scalarProduct(int[] a, int[] b){
    assert a.length == b.length;
    int s = 0;
    for(int i = 0; i < a.length; i ++){
        s+=a[i] * b[i];
    }
    return s;
}