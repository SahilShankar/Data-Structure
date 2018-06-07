import java.util.StringTokenizer;

public class string {
	String timeconvert(String time) {
		StringTokenizer st = new StringTokenizer(time,":");
		int hh = Integer.parseInt(st.nextToken());
		//System.out.println(hh);
		int mm = Integer.parseInt(st.nextToken());
		//System.out.println(mm);
		//System.out.println(st.nextToken());
		String ss = st.nextToken();
		if(ss.contains("AM") && hh == 12) {
			StringTokenizer str = new StringTokenizer(ss,"AM");
			return (hh+":"+mm+":"+str.nextToken());
		}
		if(ss.contains("PM") && hh == 12) {
			StringTokenizer str1 = new StringTokenizer(ss,"PM");
			return (hh+":"+mm+":"+str1.nextToken());
		}
		if(ss.contains("PM")) {
			StringTokenizer str2 = new StringTokenizer(ss,"PM");
			return (hh+12+":"+mm+":"+str2.nextToken());
		}
		else {
			StringTokenizer str3 = new StringTokenizer(ss,"AM");
			return (hh+":"+mm+":"+str3.nextToken());
		}
	}

	public static void main(String[] args){
		String time = "7:34:23PM";
		string st = new string();
		String result = st.timeconvert(time);
		System.out.println(result);
	}

}
