package how2j;

import java.util.Arrays;

public class HelloWorld {
    
    public static void main(String[] args) {
    	int a[] = new int[] { 18, 62, 62, 62, 65, 9 };
        
        Arrays.sort(a);
 
        System.out.println(Arrays.toString(a));
        //ʹ��binarySearch֮ǰ��������ʹ��sort��������
        System.out.println("���� 62���ֵ�λ��:"+Arrays.binarySearch(a, 62));
       
    }
}
