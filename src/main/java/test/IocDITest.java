
package test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class IocDITest {
//	int number;
	private String username;
	private int idcard;
	private List<String> playerName;
	private Map<String,Object> name;
	private Set<Integer> city;
//	public IocDITest(int number) {
//		this.number = number;
//	}
//	public IocDITest() {
//		super();
//	}
	
//	public int getNumber() {
//		return number;
//	}
//	public void setNumber(int number) {
//		this.number = number;
//	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getIdcard() {
		return idcard;
	}
	public void setIdcard(int idcard) {
		this.idcard = idcard;
	}
	public List<String> getPlayerName() {
		return playerName;
	}
	public void setPlayerName(List<String> playerName) {
		this.playerName = playerName;
	}
	public Map<String, Object> getName() {
		return name;
	}
	public void setName(Map<String, Object> name) {
		this.name = name;
	}
	public Set<Integer> getCity() {
		return city;
	}
	public void setCity(Set<Integer> city) {
		this.city = city;
	}
}
