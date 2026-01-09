class JavaApplication{
	public static void execute(){
		FaceBook obj=new FaceBook();
		obj.open();
		obj.close();
		obj.signUp();
		obj.signIn();
		obj.signOut();
		obj.close();

		Instagram obj1=new Instagram();
		obj1.open();
		obj1.close();
		obj1.signUp();
		obj1.signIn();
		obj1.signOut();
		obj1.close();
	}
}