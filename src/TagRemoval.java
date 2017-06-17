public class TagRemoval {
// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String html = "<h1> This is content </h1>"; //example string 1
		html = "<h1><font color=red> This is advance content</font></h1>"; //example string 2
		
		String noHTML = html.replaceAll("\\<.*?>","");
		System.out.println(noHTML);
	}

}