package cn.edu.neu.zhangph.structuralpattern.composite;

public class Client {
	public static void main(String[] args) {
		AbstractFile f2,f3,f4,f5;
		Folder f1;
		f1 = new Folder("�ҵĵ���");
		f2 = new ImageFile("my.jpg");
		f3 = new VideoFile("������.avi");
		
		Folder f11 = new Folder("��Ӱ");
		f4 = new VideoFile("������.avi");
		f5 = new VideoFile("���Ӣ�۴�.avi");
		
//		f2.killVirus();
//		f3.killVirus();
		f11.add(f4);
		f11.add(f5);
		f1.add(f2);
		f1.add(f3);
		f1.add(f11);
		f1.killVirus();
		
		
		
	}
}
