package future.object_oriented2;

public abstract class SoccerPlayer {
	private String name;
	private int uniformNumber;
	public SoccerPlayer(String name,int uniformNumber) {
		this.name = name;
		this.uniformNumber = uniformNumber;
	}
	public String getName() {
		return name;
	}
	public void kickBall() {
		System.out.println(name+"はボールを蹴りました");
	}
	public void catchBall() {
		System.out.println(name+"はボールを足で受け止めました");
	}
	public abstract String getPositionName();
	@Override
	public String toString() {
		return getPositionName()+" "+name+" 背番号"+uniformNumber;
	}
}
class CenterForward extends SoccerPlayer{
	public static final String POSITION_NAME = "センターフォワード";
	public CenterForward(String name, int uniformNumber) {
		super(name, uniformNumber);
	}
	public String getPositionName() {
		return POSITION_NAME;
	}
}
class GoalKeeper extends SoccerPlayer{
	public static final String POSITION_NAME = "ゴールキーパー";
	public GoalKeeper(String name, int uniformNumber) {
		super(name, uniformNumber);
	}
	public String getPositionName() {
		return POSITION_NAME;
	}
	@Override
	public void catchBall() {
		System.out.println(getName()+"はボールを手で受け止めました");
	}
}