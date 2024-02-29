package tests1;

public class ff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String str="Pragti Gupta Sharma Gaurav Hunsaurabh Testing";    //6
		String str="PragtiGuptaSharmaGauravHunsaurabhTesting";
	      int count =0;
	    
	      for(int i=0;i<=str.length()-1;i++)
	      {
	          if(str.charAt(i)>=65 && str.charAt(i)<=90)
	          {
	              //System.out.println(str.charAt(i));
	              count++;
	          }
	      }
	    System.out.print(count);
	}

}
