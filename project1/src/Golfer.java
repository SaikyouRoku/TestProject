import java.util.ArrayList;

/**
 * 
 * @author Jeffrey Ballard 2
 */
public class Golfer {
	private String name;
	private String homeCourse;
	private static int IDnum;
	ArrayList<Score> scoreList;
	static int nextIDNum = 1000;

	/**
     *
     */
	public Golfer() {
		name = "";
		homeCourse = "";
		setIDnum(IDnum);
		scoreList = new ArrayList<Score>();
	}

	/**
     *
     * @param name
     * @param homeCourse
     */
    public Golfer(String name, String homeCourse) {
		setName(name);
		setHomeCourse(homeCourse);
		setIDnum(IDnum);
		scoreList = new ArrayList<Score>();
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 */
	public String getHomeCourse() {
		return homeCourse;
	}

	/**
	 * 
	 * @param homeCourse
	 */
	public void setHomeCourse(String homeCourse) {
		this.homeCourse = homeCourse;
	}

	/**
	 * 
	 * @return
	 */
	public int getIDnum() {
		return IDnum;
	}

	/**
     *
     * @param IDnum
     */
    public void setIDnum(int IDnum) {
		if (IDnum < 1000)
			IDnum = nextIDNum + 1;
		else
			IDnum++;
		Golfer.IDnum = IDnum;
	}

	/**
	 * 
	 * @param score
	 */
	public void addScore(Score score) {
		scoreList.add(score);
	}

	/**
	 * 
	 * @param searchDate
	 * @return
	 */
	public int findScore(String searchDate) {
		int indexNum = 0;
		for (Score score : scoreList) {
			if (score.getDate() == searchDate)
				indexNum = scoreList.indexOf(score);
			else
				indexNum = -1;
		}
		return indexNum;
	}

	/**
	 * 
	 * @param searchDate
	 * @return
	 *
	public Score getScore(String searchDate) {
		for (Score score : scoreList) {
			if (score.getDate() == searchDate)
				return score;
		}
		return null;
	}
	*/
	public Score getScore(int indexNum) {
		if (indexNum >= 0)
			return scoreList.get(indexNum);
		else
			return null;
	}
		

	/**
	 * 
	 * @return
	 */
	public int lowestScore() {
		int lowScore = 200;
		for (Score score : scoreList) {
			if (score.getScore() < lowScore)
				lowScore = score.getScore();
		}
		return lowScore;
	}

	/**
	 * 
	 * @param searchDate
	 * @return
	 */
	public boolean deleteScore(String searchDate) {
		int indexNum = 0;
		for (Score score : scoreList) {
			if (score.getDate() == searchDate)
				indexNum = scoreList.indexOf(score);
		}
		if (indexNum >= 0) {
			scoreList.remove(indexNum);
			return true;
		} else
			return false;
	}

	public String toString() {
		return this.getName() + "\t ID Number: " + this.getIDnum()
				+ "\t Home Course: " + this.getHomeCourse()
				+ "\rCourse \t\tScore \tDate \t\tCourse Rating \tCourse Slope";
	}
}
