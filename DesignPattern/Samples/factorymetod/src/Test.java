import finans.Lira;
import finans.TCDarphane;

public class Test {

	public static void main(String[] args) {
		TCDarphane tc=new TCDarphane("TL");
		Lira l1 = (Lira)tc.paraBas(50);
		Lira l2 = (Lira)tc.paraBas(100);
		System.out.println(l1.toString());
		System.out.println(l2.toString());
	}

}