class FaceBook extends SoftwareApplication {
	@Override
	public void open(){
		System.out.println("Facbook opened");
	}
	@Override
	public void signUp(){
		System.out.println("Facbook signUp");
	}
	@Override
	public void signIn(){
		System.out.println("Facbook signed in ");
	}
	@Override
	public void signOut(){
		System.out.println("Facbook signed out ");
	}
	@Override
	public void close(){
		System.out.println("Facbook close ");
	}
	System.out.println();
}