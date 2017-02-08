public class PrintArrayBorder {
	static int firstLine,firstColumn = 0;
	static int lastLine,lastColumn = 0;
	
	static String [][] array = new String [5][20];

	public static void main(String args[]){
		lastLine = array.length - 1;
		lastColumn = array.length - 1;
		
		ImprimirComBorda();
		JumpLine(5);
		ImprimirComLetra("X");
	}
	
	
	private static void ImprimirComBorda(){
		for (int i = 0; i< array.length; i++){
			for (int j = 0; j < array.length; j++){
			
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
	
	private static void ImprimirComLetra(String letter){
		for (int i = 0; i< array.length; i++){
			for (int j = 0; j < array.length; j++){
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

