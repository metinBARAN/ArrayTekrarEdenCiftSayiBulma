public class Main {

    static boolean isFind(int[] arr,int value){
        for (int i:arr){
            if (i==value){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        int[] list={1,4,3,1,4,8,2,6,7,11,15,8,6};
          int[] evenNumber=new int[list.length];
          int startIndex=0;

        for (int i=0;i< list.length;i++){
            for (int j=0;j< list.length;j++){
                if ((i!=j)&&(list[i]==list[j])){
                    if (!isFind(evenNumber,list[i])){
                        evenNumber[startIndex++]=list[i];
                        break;
                    }
                }
            }
        }
        for (int value:evenNumber){
            if ((value%2!=1)&&(value!=0)){

                System.out.println(value);
            }
        }
    }
}
