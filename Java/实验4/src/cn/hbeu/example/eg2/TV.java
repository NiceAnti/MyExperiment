package cn.hbeu.example.eg2;

public class TV {
	int channel;

	void setChannel(int m) {
		if (m >= 1) {
			channel = m;
		}
	}

	int getChannel() {
		return channel;
	}

	void showProgram() {
		switch (channel) {
		case 1:
			System.out.println("�ۺ�Ƶ��");
			break;
		case 2:
			System.out.println("����Ƶ��");
			break;
		case 3:
			System.out.println("����Ƶ��");
			break;
		case 4:
			System.out.println("����Ƶ��");
			break;
		case 5:
			System.out.println("����Ƶ��");
			break;

		default:
			System.out.println("�����տ�"+channel+"Ƶ��");
			break;
		}
	}
}
