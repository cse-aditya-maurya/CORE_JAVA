class Instagram extends SoftwareApplication {
	@Override
	public void open(){
		System.out.println("Instagram opened");
	}
	@Override
	public void signUp(){
		System.out.println("Instagram signUp");
	}
	@Override
	public void signIn(){
		System.out.println("Instagram signed in ");
	}
	@Override
	public void signOut(){
		System.out.println("Instagram signed out ");
	}
	@Override
	public void close(){
		System.out.println("Instagram close ");
	}
}