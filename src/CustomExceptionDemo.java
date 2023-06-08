class TooYoungException extends RuntimeException{
	
		TooYoungException(String s)
		{
			super();
			
		}
}



class TooOldException extends RuntimeException{

	public TooOldException(String s) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}




public class CustomExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=Integer.parseInt(args[0]);
		
		if(age>60)
		{
			throw new TooOldException("Younger age is already over");
		}
		else if(age<18)
		{
			throw new TooYoungException("Please wait for some time");
		}
		System.out.println("Thanks for register");
	}

}
