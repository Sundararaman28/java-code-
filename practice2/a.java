import java.util.*; 
public class a {
       public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        
        int a=obj.nextInt();
        
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=obj.nextInt();
            
        }
        System.out.println(arr);
        obj.close();
    }
    

}
    

