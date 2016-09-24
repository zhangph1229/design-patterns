package cn.edu.neu.zhangph.structuralpattern.composite;

public interface Component {
	void operation();
}

interface Leaf extends Component{
	
}
interface Comosite extends Component{
	void add(Component component);
	void remove(Component component);
	Component getChild();
}
