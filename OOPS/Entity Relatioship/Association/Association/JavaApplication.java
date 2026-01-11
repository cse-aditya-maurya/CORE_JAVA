class JavaApplication {
	public static void execution(){
		MediaPlayer mediaPlayer=new MediaPlayer("Boat","India",554320.44);
		Car car=new Car("Hyundai-Creta","India",9696969.6969,"Crimson");
		car.displayCarInfo();
		car.getEngine().displayEngineInfo();
		car.setMediaPlayer(mediaPlayer);
		car.getMediaPlayer().displayMediaPlayerInfo();
	}
}