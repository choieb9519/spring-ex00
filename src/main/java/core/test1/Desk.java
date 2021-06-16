package core.test1;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Desk {
	private Leg leg;
	
/*	//생성자 통해
	public Desk(Leg leg) {
		this.leg = leg;
	}
	
	//set메소드 통해
	public void setLeg(Leg leg);
*/
}
