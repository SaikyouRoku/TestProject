/**
 * 
 * @author Jeffrey Ballard
 */
public class Score {
	private int score;
	private String courseName;
	private String date;
	private int courseRating;
	private double courseSlope;

	/**
     *
     */
	public Score() {
		courseName = "";
		score = 0;
		date = "";
		courseRating = 0;
		courseSlope = 0;
	}

	/**
     *
     * @param courseName
     * @param score
     * @param date
     * @param courseRating
     * @param courseSlope
     */
    public Score(String courseName, int score, String date, int courseRating, double courseSlope) {
		setCourseName(courseName);
		setScore(score);
		setDate(date);
		setCourseRating(courseRating);
		setCourseSlope(courseSlope);
	}

	/**
	 * 
	 * @return
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * 
	 * @param courseName
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * 
	 * @return
	 */
	public int getScore() {
		return score;
	}

	/**
	 * 
	 * @param score
	 */
	public void setScore(int score) {
		if (score >= 40 && score <= 200) {
			this.score = score;
		} else {
			this.score = 9999;
			System.out.println("Invalid score!");
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getDate() {
		return date;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * 
	 * @return
	 */
	public int getCourseRating() {
		return courseRating;
	}

	/**
	 * 
	 * @param courseRating
	 */
	public void setCourseRating(int courseRating) {
		if (courseRating >= 60 && courseRating <= 80) {
			this.courseRating = courseRating;
		} else {
			this.courseRating = 9999;
			System.out.println("Invalid course rating!");
		}
	}

	/**
	 * 
	 * @return
	 */
	public double getCourseSlope() {
		return courseSlope;
	}

	/**
	 * 
	 * @param courseSlope
	 */
	public void setCourseSlope(double courseSlope) {
		if (courseSlope >= 55 && courseSlope <= 155) {
			this.courseSlope = courseSlope;
		} else {
			this.courseSlope = 9999;
			System.out.println("Invalid course slope!");
		}
	}

	public String toString() {
		return courseName + "\t" + score + "\t" + date + "\t\t" + courseRating
				+ "\t\t" + courseSlope;
	}
}
