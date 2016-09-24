package cn.edu.neu.zhangph.structuralpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * ��Ԫ������
 * @author zhangph
 *
 */
public class ChessFlyWeightFactory {
	private static Map<String, ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();
	public static ChessFlyWeight getChess(String color){
		if(map.get(color) != null){
			return map.get(color);
		}else{
			ChessFlyWeight cFlyWeight = new ConcreteChess(color);
			map.put(color, cFlyWeight);
			return cFlyWeight;
		}
	}
}
