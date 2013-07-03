//ファクトリメソッドをもつクラスの例
private My(){
	static My getInstance(){
		My my = new My();
		return my;
	}
}
//呼び出し側
My my = My.getInstance();