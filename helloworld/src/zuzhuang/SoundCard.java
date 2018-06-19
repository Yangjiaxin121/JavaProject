package zuzhuang;

public class SoundCard implements PCI{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("DU du....");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Sound stop");
	}

}
