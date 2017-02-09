public class PrintArrayBorder {
	static int firstLine,firstColumn = 0;
	static int lastLine,lastColumn = 0;
	
	static String [][] array = new String [10][15];

	public static void main(String args[]){
		lastLine = array.length - 1;
		lastColumn = array[1].length - 1;
		
		PrintWithBorder();
		JumpLine(5);
		PrintWithLetter(".");
	}
	
	private static void PrinthBorder(){
		
	
	}
	private static void PrintWithBorder(){
		for (int i = 0; i< array.length; i++){
			for (int j = 0; j < array[1].length; j++){
			
				if(i == firstLine || i  ==  lastLine)
					System.out.print("-");		
				else if(j  ==  firstColumn || j  ==  lastColumn)
					System.out.print("|");
				else
					System.out.print(" ");
							
			}
		JumpLine(1);
		}
	}
	
	private static void PrintWithLetter(String letter){
		for (int i = 0; i< array.length; i++){
			for (int j = 0; j <  array[1].length; j++){
				if(i != firstLine && i !=  lastLine){
					if(j !=  firstColumn && j !=  lastColumn){
						System.out.print(" ");
						continue;
					}
				}
				System.out.print(letter);
			}
		JumpLine(1);
		}
	}
	
	private static void JumpLine(int line){
		for(int i = 0 ; i < line; i++)
			System.out.println("");
	}
	
}

