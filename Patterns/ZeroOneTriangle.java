class Main {
    public static void main(String[] args) {
        int val=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(val+" ");
                if(val==1){
                    val--;
                }else{
                    val++;
                }
            }
            System.out.println();
        }
    }
}
