package payroll;

public class payroll {

	public static void main(String[] args) {
		String empNo = "1";
		String empName = "GANESH";
        String designation = "Clerk";
        String GenDate = "15/9/2013";
        int  daysWorked = 25;
        int payrate = 400;
         String iTem1 = "BASIC PAY", iTem2 = "GROSS EARN.";
        int AB= 10000, AG = 10000;
        String iTem3 = "P.F.", iTem4 = "TOTAL DEDUCT.", iTem5 ="NET PAY", iTem6 ="PROF.TAX";
        int basicpay= daysWorked*payrate;
       int PF= basicpay/10;
       final double profTax= 0.2 *basicpay; 
       double TD=  PF+ profTax;
       double NP= basicpay-TD;
       
        System.out.println("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP : 1");
        System.out.println("");
        System.out.println("                 SHREE KRISHNA CHEMISTS AND DRUGGIST                       ");
        System.out.println("                         SALARY MONTH 9 2013                               ");
        System.out.println("");
        System.out.println("EMP.NO.: " + empNo + "\t\t\t\t" + "EMP.Name: " + empName + "\t\t" + "DESIGNATION: " + designation);
        System.out.println("DAYS WORKED: " +daysWorked + "\t\t\t\t" +"PAY RATE: "+ payrate +"\t\t\t"+ "GEN.DATE:" + GenDate);
        System.out.println("______________________________________________________________________________________________________________");
        System.out.println("EARNINGS              AMOUNT(RS.)               DEDUCTIONS                    AMOUNT(RS.)     ");
        System.out.println("______________________________________________________________________________________________________________");
        System.out.println(iTem1 + "\t" + "\t" + AB + "\t\t" + " \t" + iTem3  + "\t\t" + "\t\t" +PF );
        System.out.println(    "\t\t\t\t\t\t"+iTem6 +"\t"+ "\t\t"+ profTax);
        System.out.println("______________________________________________________________________________________________________________");
        System.out.println(iTem2 + "\t" + "\t" + AG + "\t\t" + " \t" + iTem4  + "\t" + "\t\t" +TD );
        System.out.println(              "\t\t\t\t\t\t" +iTem5 +"\t\t"+ "\t\t"+ NP);
           

}

	}


