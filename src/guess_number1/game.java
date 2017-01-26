//UTF-8
package guess_number1;
import java.util.Scanner;
import java.util.Random;
public class game {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Random sj=new Random();
                System.out.println("本程序开源，程序源代码请到github.com/fangzihan查看\n");
                System.out.println("---------------------------------");
                System.out.println("猜数游戏1.0 build8166    by方子寒");
                System.out.println("---------------------------------");
		System.out.println("●您好，请输入您的姓名：\n");
		String name=in.next();
		System.out.println("\n●好的"+name+",欢迎使用由方子寒开发的#猜数游戏#,\n\n想要了解游戏玩法请输入1，开始游戏请输入2,退出游戏请输入3：\n");
		String putIn=in.next();
		if (putIn.equals("3")) {
			System.exit(0);
                }
                if(putIn.equals("1")) {
                        System.out.println("\n●游戏会要求您输入两个0-10中的整数，系统也会随机生成两个数\n如果你输入的数与系统生成的数相同，恭喜你中奖啦！\n");
                        System.out.println("●输入1开始游戏：\n");
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
                        System.out.println("\n●请输入第1个整数（0-10）\n");
			int in1=in.nextInt();
			System.out.println("\n●请输入第2个整数（0-10）\n");
			int in2=in.nextInt();
			System.out.println("\n●请确认数字输入无误，确认无误后输入1\n");
                        System.out.println("第一个数字"+in1+",第二个数字"+in2+"\n");
			String b=in.next();
                        if(in1==in2) {
                        System.out.println("\n●输入的两数不能相同，输入1退出游戏\n");
                        String c1=in.next();
                        System.exit(0);
                        }
                    if(b.equals("1")) {
                    do{
                    num1=sj.nextInt(11);
                    num2=sj.nextInt(11);
                    }while(num1==num2);
                    System.out.println("\n●中奖数生成完毕，它们是："+num1+","+num2+"\n");
                    int score=0;
                    if((in1==num1)||(in1==num2)) {
                    score=score+1;
                    }
                    if((in2==num1)||(in2==num2)) {
                    score=score+1;
                    }
                    if(score==0) {
                    System.out.println("(?_?)非常遗憾,你猜对0个数字，输入1退出游戏\n输入2重新游戏\n");
                    back=in.next();
                    if(back.equals("1")) {
                    System.exit(0);
                    }
                    if(back.equals("2")) {
                    re=1;
                    continue;
                    }
                    }else if(score==1) {
                    System.out.println("(^.^)恭喜你，猜对1个数字！输入1退出游戏\n输入2重新游戏\n");
                    back=in.next();
                    if(back.equals("1")) {
                    System.exit(0);
                    }
                    if(back.equals("2")) {
                    re=1;
                    continue;
                    }
                    }else if(score==2) {
                    System.out.println("↖(^ω^)↗喜大普奔，猜对2个数字！输入1退出游戏\n输入2重新游戏\n");
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