
public class SPdata {

	private String date;
	private String open;
	private String high;
	private String low;
	private String close;
	private String volume;
	private String adjClose;
	
	
	public SPdata(String date, String open, String high, String low, String close,
			String volume, String adjClose) {
		
		this.date = date;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = high;
		this.volume = volume;
		this.adjClose = adjClose;
		
	}
	
	public String getDate() {
		return date;
	}
	public String getOpen() {
		return open;
	}
	public String getHigh() {
		return high;
	}
	public String getLow() {
		return low;
	}
	public String getClose() {
		return close;
	}

	public String getVolume() {
		return volume;
	}
	public String getAdjClose() {
		return adjClose;
	}
	
	public String toString() {
		
		String retval = "[date: " + date + ", High: " + high + ", Low: " + low + "]";
		return retval;
	}
}
