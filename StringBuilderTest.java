//小文字をすべて大文字に変換する処理
public class StringBuilderTest{
	public static void stringBuilderToUpperCase(StringBuilder sb){
		for (int i = 0; i < sb.length(); i++){
			char c = sb.charAt(i);
			char uc = Character.toUpperCase(c);
			sb.setCharAt(i, uc);
		}
	}
	
	public static void main (String[] args){
		//処理
		if (args.length == 0){
			System.out.println("usage: stringBuilderTest message-to-uppercase");
			return;
		}
		StringBuilder input = new StringBuilder(args[0]);
		stringBuilderToUpperCase(input);
		System.out.println(input);
	}
}