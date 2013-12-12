public class GolferTester {
	public static void main(String[] args) {
		
		// Build first golfer object and populate array list for object
		Golfer golfer1 = new Golfer("Finn Human", "Treefort");
		golfer1.addScore(new Score("Fire Kingdom", 73, "06/03/2012", 72, 69.5));
		golfer1.addScore(new Score("The Dungeon", 62, "07/25/2012", 63, 79.5));
		
		//Prints results of information for first golfer
		System.out.println(golfer1.toString());
		for (int i = 0; i < golfer1.scoreList.size(); i++) {
			System.out.println(golfer1.scoreList.get(i));
		}
		
		//Input that will test error messages
		golfer1.addScore(new Score("Another Place", 20, "08/08/2008", 20, 20.0));
		golfer1.addScore(new Score("Different Place", 2001, "08/08/2008", 100, 500.0));
				
		// Build and populate array list for second golfer object
		Golfer golfer2 = new Golfer("Ice King", "Ice Kingdom");
		golfer2.addScore(new Score("Nightosphere", 47, "08/16/1999", 63, 79.5));
		golfer2.addScore(new Score("Secondland", 48, "07/23/1999", 61, 74.5));
		golfer2.addScore(new Score("Thirdplace", 55, "07/21/1999", 66, 69.5));
		golfer2.addScore(new Score("Fourthroute", 46, "06/21/1999", 80, 62.5));
		golfer2.addScore(new Score("Fiftharea", 52, "07/12/1999", 80, 62.5));
		System.out.println(golfer2.toString());

		// pass a date through to find data on second object
		String scoreTest = "07/12/1999";
		System.out.println("Found:");
		System.out.println(golfer2.toString());
		//System.out.println("Score index of found score: "
		//		+ golfer2.getScore(scoreTest));
		System.out.println("Score value of found score: "
				+ golfer2.findScore(scoreTest));

		// Print's out Golfer 2's lowest score
		System.out.print("Lowest score is " + golfer2.lowestScore() + " for ");
		System.out.println(golfer2.getName());

		// Print's out entire score list for golfer 2
		System.out.println(golfer2.toString());
		for (int i = 0; i < golfer2.scoreList.size(); i++) {
			System.out.println(golfer2.scoreList.get(i));
		}

		// Delete's a score for golfer 2, attempts to find/print results
		golfer2.deleteScore(scoreTest);
		//System.out.println(golfer2.getScore(scoreTest));
		System.out.println(golfer2.findScore(scoreTest));

		// Print's out entire score list for golfer 2
		System.out.println(golfer2.toString());
		for (int i = 0; i < golfer2.scoreList.size(); i++) {
			System.out.println(golfer2.scoreList.get(i));
		}

		String someDate = "06/21/1999";
		System.out.println(golfer2.findScore(someDate));
		System.out.println(golfer2.getScore(golfer2.findScore(someDate)));
	}
}
