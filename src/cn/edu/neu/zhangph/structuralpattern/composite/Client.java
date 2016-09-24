package cn.edu.neu.zhangph.structuralpattern.composite;

public class Client {
	public static void main(String[] args) {
		AbstractFile f2,f3,f4,f5;
		Folder f1;
		f1 = new Folder("我的电脑");
		f2 = new ImageFile("my.jpg");
		f3 = new VideoFile("霸王别姬.avi");
		
		Folder f11 = new Folder("电影");
		f4 = new VideoFile("霸王别姬.avi");
		f5 = new VideoFile("射雕英雄传.avi");
		
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
