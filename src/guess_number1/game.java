package guess_number1;
import java.util.Scanner;
import java.util.Random;
public class game {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Random sj=new Random();
                System.out.println("������Դ������Դ�����뵽github.com/fangzihan�鿴\n");
                System.out.println("---------------------------------");
                System.out.println("������Ϸ1.0 build8166    by���Ӻ�");
                System.out.println("---------------------------------");
		System.out.println("�����ã�����������������\n");
		String name=in.next();
		System.out.println("\n��õ�"+name+",��ӭʹ���ɷ��Ӻ�������#������Ϸ#,\n\n��Ҫ�˽���Ϸ�淨������1����ʼ��Ϸ������2,�˳���Ϸ������3��\n");
		String putIn=in.next();
		if (putIn.equals("3")) {
			System.exit(0);
                }
                if(putIn.equals("1")) {
                        System.out.println("\n����Ϸ��Ҫ������������0-10�е�������ϵͳҲ���������������\n��������������ϵͳ���ɵ�����ͬ����ϲ���н�����\n");
                        System.out.println("������1��ʼ��Ϸ��\n");
                        String a1=in.next();
                        putIn="2";
		}
                if(putIn.equals("2")) {
                        int num1=1;
                        int num2=1;
                        int re=0;
                        String back;
			do{
                        re=0;
                        System.out.println("\n���������1��������0-10��\n");
			int in1=in.nextInt();
			System.out.println("\n���������2��������0-10��\n");
			int in2=in.nextInt();
			System.out.println("\n����ȷ��������������ȷ�����������1\n");
                        System.out.println("��һ������"+in1+",�ڶ�������"+in2+"\n");
			String b=in.next();
                        if(in1==in2) {
                        System.out.println("\n�����������������ͬ������1�˳���Ϸ\n");
                        String c1=in.next();
                        System.exit(0);
                        }
                    if(b.equals("1")) {
                    do{
                    num1=sj.nextInt(11);
                    num2=sj.nextInt(11);
                    }while(num1==num2);
                    System.out.println("\n���н���������ϣ������ǣ�"+num1+","+num2+"\n");
                    int score=0;
                    if((in1==num1)||(in1==num2)) {
                    score=score+1;
                    }
                    if((in2==num1)||(in2==num2)) {
                    score=score+1;
                    }
                    if(score==0) {
                    System.out.println("(?_?)�ǳ��ź�,��¶�0�����֣�����1�˳���Ϸ\n����2������Ϸ\n");
                    back=in.next();
                    if(back.equals("1")) {
                    System.exit(0);
                    }
                    if(back.equals("2")) {
                    re=1;
                    continue;
                    }
                    }else if(score==1) {
                    System.out.println("(^.^)��ϲ�㣬�¶�1�����֣�����1�˳���Ϸ\n����2������Ϸ\n");
                    back=in.next();
                    if(back.equals("1")) {
                    System.exit(0);
                    }
                    if(back.equals("2")) {
                    re=1;
                    continue;
                    }
                    }else if(score==2) {
                    System.out.println("�I(^��^)�Jϲ���ձ����¶�2�����֣�����1�˳���Ϸ\n����2������Ϸ\n");
                    back=in.next();
                    if(back.equals("1")) {
                    System.exit(0);
                    }
                    if(back.equals("2")) {
                    re=1;
                    continue;
                    }
                    }
	            }
                    }while(re==1);
                    }
    }
}