package cn.edu.neu.zhangph.structuralpattern.composite;

import java.util.*;

public interface AbstractFile {
	void killVirus();
}

class ImageFile implements AbstractFile{

	private String name;
	
	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("ͼ���ļ�" + name + "....");
	}
	
}

class VideoFile implements AbstractFile{

	private String name;
	
	public VideoFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("��Ƶ�ļ�" + name + "....");
	}
	
}


class Folder implements AbstractFile{

	private String name;
	private List<AbstractFile> list = new ArrayList<AbstractFile>();
	
	public Folder(String name) {
		super();
		this.name = name;
	}
	
	public void add(AbstractFile af){
		list.add(af);
	}
	public void remove(AbstractFile af){
		list.remove(af);
	}
	public AbstractFile getAbstractFile(int index){
		return list.get(index);
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public void killVirus() {
		System.out.println("�ļ���" + name + "....");
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			AbstractFile type = (AbstractFile) iterator.next();
			type.killVirus();
		}
	}
	
}