package how2j;

public class HelloWorld {
    int i = 1; //��������i
    public void method1(int i){ //����Ҳ��i
        System.out.println(i);
    }
     
    public static void main(String[] args) {
        new HelloWorld().method1(5);
        //�����ӡ������ 1����5?
    }
}
