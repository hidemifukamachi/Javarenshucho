public class StringTest {
	public static void main (String[] args){
		//簡易な文字列の抽出
		if (args.length == 0){
		System.out.println("usage: StringTest From:mail-header(e.g. \"bill Joy\" <bill.joy@xsun.coom>\")");
		return;

		}
		String input = args[0];
		int begin = input.indexOf('<');
		if (begin >= 0){
			begin++;
			int end = input.indexOf('>');
			if (end > begin){
				String addr = input.substring(begin,end);
				System.out.println(addr);
			}
		}
	}
}