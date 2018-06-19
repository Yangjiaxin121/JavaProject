package zuzhuang;

public class Assembler {
	public static void main(String[] args) {
		MainBoard mb = new MainBoard();
		NetWorkCard nc = new NetWorkCard();
		mb.usePCICard(nc);
		SoundCard sc = new SoundCard();
		mb.usePCICard(sc);
	}
	

}
