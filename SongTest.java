import java.util.*;

public class SongTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int sCounter=0;
		
		
		new Singer ("Frank Sinatra"); 
		new Singer ("Wham!");   
		new Singer ("Mariah Carey");   
		new Singer ("Chris Rea");  
		new Singer ("Sia");   
		   
		new Song ("All I Want for Christmas Is You",Singer.singers[2],"https://www.youtube.com/watch?v=yXQViqx6GMY" ); 
		new Song ("White Christmas",Singer.singers[0], "https://www.youtube.com/watch?v=q_XzZNCDWCA" );    
		new Song ("Last Christmas",Singer.singers[1], "https://www.youtube.com/watch?v=E8gmARGvPlI" );     
		new Song ("Driving home for christmas",Singer.singers[3], "https://www.youtube.com/watch?v=EvDxSW8mzvU");    
		new Song ("Santa's Coming For Us",Singer.singers[4], "https://www.youtube.com/watch?v=V3EYjVPRClU" ); 
		new Song ("Let It Snow! Let It Snow! Let It Snow!",Singer.singers[0], "https://www.youtube.com/watch?v=vGRC2LYmHfU" ); 
		
		System.out.println("************* Welcome to our DMST Christmas New Music Application *************");
		
		while (true){
			
			System.out.println("Menu:");
			System.out.println("Type 1 to display singers' list");
			System.out.println("Type 2 to display Frank Sinatra's available songs");
			System.out.print("Type here:");
			int choice = scanner.nextInt();

			if (choice == 1){
				System.out.println("\n\t** Display Singers' List **");
				for (Singer  s1: Singer.singers){
					if (s1!= null)
						System.out.println("\t"+s1.toString());
				}
				System.out.printf("\n \t**Total number of singers: %d **\n",Singer.counter);
			}
			else if (choice == 2 ){
				System.out.println("\n\t** Display Frank's Sinatra Song List **");
				for (Song s2: Song.songs){
					if (s2!= null){
						if (s2.getSinger().getName().equals("Frank Sinatra")) 
							sCounter++;
					}
				}
				System.out.printf("\t%d songs were found!\n",sCounter);
				for (Song s2: Song.songs){
					if (s2!= null){
						if (s2.getSinger().getName().equals("Frank Sinatra")) 
							System.out.println("\t"+s2.toString());
					}
				}	
			}
			else//------if choice is not 1 or 2
				System.err.println("\t\t\t\tWrong Input");
			
			System.out.println("******************************************************************************\n");
		}//-----end of while(true)
	}//----end of main
}//----end of class SongTest
