package programmer.demo;

import java.util.ArrayList;
import java.util.HashSet;

class UndirectedGraphNode {
    int label = 0;
    UndirectedGraphNode left = null;
    UndirectedGraphNode right = null;
    ArrayList<UndirectedGraphNode> neighbors = new ArrayList<UndirectedGraphNode>();

    public UndirectedGraphNode(int label) {
        this.label = label;
    }
}
public class IsGraphPath {
	public boolean checkPath(UndirectedGraphNode a, UndirectedGraphNode b) {
		if (null == a || null == b)
			return false;
		HashSet<UndirectedGraphNode> map = new HashSet<UndirectedGraphNode>();
		boolean res = checkPathCore(a, b, map);
		map.clear();
		return res || checkPathCore(b, a, map);
	}

	public boolean checkPathCore(UndirectedGraphNode a, UndirectedGraphNode b, HashSet<UndirectedGraphNode> map) {
		if (a == b)
			return true;
		map.add(a);// ���a�ѱ�����
		for (int i = 0; i < a.neighbors.size(); i++) {
			if (!map.contains(a.neighbors.get(i)) && checkPathCore(a.neighbors.get(i), b, map))
				return true;// ��������������·���������أ����ⲻ��Ҫ��ѭ�������³�ʱ��
		}
		return false;
	}

}