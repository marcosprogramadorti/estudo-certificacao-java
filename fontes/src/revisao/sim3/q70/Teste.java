package revisao.sim3.q70;

class A {
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	private Long id;
	private String name; 
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}

public class Teste {
	

	public static void main(String[] args) {
		A a = 	new A();
		A a2 =	new A();
		System.out.println(a==a2);
		System.out.println(a.equals(a2)); 
		System.out.println(a.hashCode() == a2.hashCode());
		
		System.out.println(a.hashCode());
		System.out.println(a2.hashCode());
	}
}
