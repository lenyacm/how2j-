package how2j;

public class Hero2 {
    String name; //����
      
    float hp; //Ѫ��
      
    float armor; //����
      
    int moveSpeed; //�ƶ��ٶ�
 
    //�Ӷ���
    void keng(){
        System.out.println("�Ӷ��ѣ�");
    }
 
    //��ȡ����ֵ
    float getArmor(){
        return armor;
    }
     
    //�����ƶ��ٶ�
    void addSpeed(int speed){
        //��ԭ���Ļ����������ƶ��ٶ�
        moveSpeed = moveSpeed + speed;
    }  
    
    void legendary() {
    	System.out.println("����");
    }
     
    float getHp() {
    	return hp;
    }
    
    void recovery(float blood) {
    	hp+=blood;
    }
}