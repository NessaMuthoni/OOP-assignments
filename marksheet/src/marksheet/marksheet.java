package marksheet;

public class marksheet {

	public static void main(String[] args) {
		String iTem1 = "kathir", iTem2 = "Lakshmi", iTem3 = "Aishwarya";
		int S1=1, S2=2, S3=3;
        int KSB1 = 10, KSB2 = 20, KSB3 = 30, KSB4= 40,KSB5=50;
        int LSB1 = 90, LSB2 = 80, LSB3 = 70, LSB4= 80,LSB5=100;
        int ASB1 = 90, ASB2 = 85, ASB3 = 75, ASB4= 65,ASB5=95;
       int TK= KSB1+ KSB2+ KSB3+ KSB4+ KSB5;
       int TL=LSB1+ LSB2+ LSB3+ LSB4+ LSB5;
       int TA= ASB1+ ASB2+ ASB3+ ASB4 +ASB5;
       int AvgK= TK/5;
       int AvgL=TL/5;
       int AvgA=TA/5;
       int sumAvg= AvgK+ AvgL+AvgA; 
       int AvgS1=(KSB1+LSB1+ASB1)/3;
       int AvgS2=(KSB2+LSB2+ASB2)/3;
       int AvgS3=(KSB3+LSB3+ASB3)/3;
       int AvgS4=(KSB4+LSB4+ASB4)/3;
       int AvgS5=(KSB5+LSB5+ASB5)/3;
       
        System.out.println("Welcome to studnt Mark List Application");
        System.out.println("________________________________________________________________________________________");
        System.out.println("SNo     Student Name    Sub1    Sub2    Sub3    Sub4    Sub5    Total         Average");
        System.out.println("________________________________________________________________________________________");
        System.out.println(S1 +  "\t" +iTem1 + "\t\t" + KSB1 +  "\t" +KSB2 + "\t" + KSB3+ "\t" + KSB4 +"\t"  +KSB5  +  "\t"+ TK+"\t\t"+AvgK);
        System.out.println(S2 +  "\t" +iTem2 + "\t\t" + LSB1 +  "\t" +LSB2 + "\t" + LSB3+ "\t" + LSB4 +"\t"  +LSB5  +  "\t"+ TL+"\t\t"+AvgL);
        System.out.println(S3 +  "\t" +iTem3 + "\t" + ASB1 +  "\t" +ASB2 + "\t" + ASB3+ "\t" + ASB4 +"\t"  +ASB5  +  "\t"+ TA+"\t\t"+AvgA);
        System.out.println("________________________________________________________________________________________");
        System.out.println("                                                            Sum of Average:\t"  +sumAvg );
        System.out.println("________________________________________________________________________________________");
        System.out.println("SUBJECT AVERAGES:\t" +AvgS1 +  "\t" +AvgS2 + "\t" + AvgS3 +  "\t" +AvgS4 + "\t" + AvgS5);
        System.out.println("________________________________________________________________________________________");
       
       

}
	}


