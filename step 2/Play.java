
public class Play {
	private String eventName;
	private String startTime;
	private String date;
	private int duration;
	
	public Play(String eventName, String startTime, String date, int duration) {
		setEventName(eventName);
		setStartTime(startTime);
		setDate(date);
		setDuration(duration);
	}
	
	public Play(String eventName, String startTime, String date) {
		this(eventName, startTime, date, 1);
	}
	
	public Play(String eventName) {
		this(eventName, "00:00", "Jan 01 22", 1);
	}
	
	public Play(String date, int duration) {
		this("Default Event Name", "00:00", date, duration);
	}
	
	public Play(String startTime, String date, int duration) {
		this("Default Event Name", startTime, date, duration);
	}
	
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventName() {
		return eventName;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStartTime() {
		return startTime;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getDuration() {
		return duration;
	}
	
	public String calculateEndTime() {
		String[] parts = getStartTime().split(":");
		int startTime_H = Integer.parseInt(parts[0]); //hour
		int startTime_M = Integer.parseInt(parts[1]); //minute
		startTime_H += getDuration();
		return Integer.toString(startTime_H)+":"+Integer.toString(startTime_M);
	}
	
	public void display() {
		System.out.println(getEventName() + " starts at " + getStartTime()+ " on "+ getDate() + " and ends at " + calculateEndTime());
	}

	public String eventInfo() {
		return getEventName() + " which starts at " + getStartTime()+ " on "+ getDate() + " and ends at " + calculateEndTime();
	}
}
