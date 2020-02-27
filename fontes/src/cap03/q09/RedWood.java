package cap03.q09;

public class RedWood extends Tree{
	
	public static void main(String[] args) {
		new RedWood().go();
	}
	
	void go() {
		//go2(new Tree(),new RedWood());
		go2((RedWood)new Tree(), new RedWood());
	}
	void go2(Tree t1, RedWood r1) {
		RedWood r2 = (RedWood)t1;
		Tree t2 = (Tree)r1;
		NadaHaver n = new NadaHaver();
		RedWood r3 = new RedWood();
		Tree t4 = new Tree();
		RedWood r5 = (RedWood)t4;
		Tree t5 = (Tree) r3;
	}
}
class Tree{
	
}
class NadaHaver{
	
}