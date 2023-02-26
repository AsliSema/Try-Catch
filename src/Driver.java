
public class Driver {
	public static void main(String[] args) {
		Isci isci = new Isci();
		try {
			isci.setIsim("as");
		} catch (HataliDeger e1) {
			System.out.println(e1.getMessage());
		}
		//isci.setMaas(-2200);
		
		try {
			isci.setMaas(-2200);
		}catch(HataliDeger e) {
			System.out.println(e.getMessage());
		}
		System.out.println(isci);
	}
}

