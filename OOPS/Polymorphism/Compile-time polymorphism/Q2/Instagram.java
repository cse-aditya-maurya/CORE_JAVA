class Instagram {
	public String username;
	public String password;
	public String mailId;
	public String captch;
	public long contactNubmer;
	public int otp;
	public void login(String username,String password){
		this.username=username;
		this.password=password;
		System.out.println("Log in successfull!!");
	}
	public void login(String username,String password,String captch){
		this.username=username;
		this.password=password;
		this.captch=captch;
		System.out.println("Log in successfull!!");
	} 
	public void login(long contactNubmer,int otp){
		this.contactNubmer=contactNubmer;
		this.otp=otp;
		System.out.println("Log in successfull!!"); 
	}
	public void login(String mailId,int otp)
	{
		this.mailId=mailId;
		this.otp=otp;
		System.out.println("Log in successfull!!");

	}
}