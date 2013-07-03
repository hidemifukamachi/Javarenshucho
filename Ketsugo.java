//非効率になる恐れのある文字列の結合処理


// public static String concat(String[] array){
// 		String result = "";
// 		for (String s = : array){
// 			result += s;
// 			}
// 	return result;
// }


//効率的な文字列の結合処理
public static String concat(String[] arr){
		StringBulder result = new StringBulder();
		for (String s : arr){
			result.append(s);
		}
		return result.toString();

}