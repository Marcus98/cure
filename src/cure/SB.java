package cure;

public class SB {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("jack");
		sb.append(true);
		sb.append('a');
		sb.append(97).append(34.0).append(new char[] {'o','o'});
		System.out.println(sb.toString());
		sb = new StringBuffer("jack");
		sb.insert(1, "java");
		System.out.println(sb.toString());
		System.out.println(sb.toString());
		System.out.println(sb.indexOf("c"));
		System.out.println(sb.substring(2));
		sb.replace(0, 0, "java");
		System.out.println(sb);
		sb.delete(4, 11);
		System.out.println(sb);
		System.out.println(sb.deleteCharAt(4));
		System.out.println(sb.reverse());
		
	}
}