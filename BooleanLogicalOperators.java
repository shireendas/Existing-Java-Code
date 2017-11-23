
public class BooleanLogicalOperators {

	public static void main(String[] args) {
		
		boolean a = true, b = false;
		
		System.out.println(a&a); // & stands for logical And operator, a&a will perform true&true operation and will result in true as both the variables holds true
		System.out.println(a&b); // a&b i.e. true&false, this will result in false as one of the variable holds false
		System.out.println(b&a); // b&a i.e. false&true, this will result in false as one of the variable holds false
		System.out.println(b&b); // b&b i.e. false&false, this will result in false as both the variables holds false
		System.out.println("===========");
		System.out.println(a|a); // '|' stands for logical OR operator, a|a will perform true|true operation and will result in true as both the variables 
		System.out.println(a|b); // a|b i.e. true|false, this will result in true as one of the variable holds true
		System.out.println(b|a); // b|a i.e. false|true, this will result in true as one of the variable holds true
		System.out.println(b|b); // b|b i.e. false|false, this will result in false as both the variables holds false
		System.out.println("=============");
		System.out.println(!a); // '!' stand for NOT operator, as the value of a is true so the value of !a will be !true i.e. false
		System.out.println(!b); // '!' stand for NOT operator, as the value of b is false so the value of !b will be !false i.e. true

	}

}
