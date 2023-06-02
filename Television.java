public class Television{
	private String productName;
	private boolean isOn;
	private int Volume;
	private int Channel;
	private boolean mute;
	
	public Television(String productName){
	     this.productName = productName;
	}
	public void setProductName(){
	}
	
	public String getProductName(){
	     return productName;
	}
	
	public void setIsOn (boolean isOn){
	     this.isOn = isOn;
	}
	
	public boolean isOn(){
	     return isOn;
	}
	
	public void setVolume(int volume){
	     this.volume = volume;
	}
	
	public int getVolume(){
	     return volume;
	}
	
	public void setChannel(int channel){
	     this.channel = channel;
	}
	
	public int getChannel(){
	     return channel;
	}
	
	public void setMute(boolean mute){
	     this.mute = mute;
	}
	
	public boolean getMute(){
	     return mute;
	}
}