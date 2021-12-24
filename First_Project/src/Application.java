import java.io.*;
import java.util.*;

public class Application {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		for(;;)
		{

			System.out.println("\t\t----WELCOME!----\t\t");
			System.out.println("\t  Lockers Pvt. Ltd Application\t\t");
			System.out.println("\t\t\t\tDeveloped By -Ankita");
			System.out.println("\n");
			System.out.println("\t-----MAIN MENU-----\t\t\t");
			System.out.println("\t1.Current File Details\n\t2.Perform changes on file\n\t3.Exit\n");

			System.out.println("Enter your choice:");
			int choice=sc.nextInt();

			outer: switch(choice)
			{
			case 1:
				System.out.println("The currect files present are:\n");
				File f1=new File("E:\\Eclipse\\Eclipse_Store\\First_Project\\");
				File array[]=f1.listFiles();
				for(int i=0;i<array.length;i++)
				{
					if(i<0)
					{
						System.out.println("No files/folders created!");

					}
					else
					{
						System.out.println(array[i]+"\n");
					}


				}
				break;

			case 2:
				for(;;)
				{


					System.out.println("\t---MENU---\n");
					System.out.println("\t1.Add a File\n");
					System.out.println("\t2.Delete a File\n");
					System.out.println("\t3.Search a File\n");
					System.out.println("\t4.Return to previous Menu\n");
					System.out.println("\t5.Exit\n");

					System.out.println("Enter your option:");
					int option=sc.nextInt();

					switch(option)
					{
					case 1:
						System.out.println("Do you want to create file or folder?\n");
						System.out.println("1.File\n2.Folder\n");
						System.out.println("Enter the option:");
						int op1=sc.nextInt();

						if(op1==1)
						{

							System.out.println("Please enter file name to be created:");
							String fname=sc.next();
							File f=new File(fname);
							if(f.exists())
							{
								System.out.println("File Already exists! File cannot be created!\n");
							}
							else
							{
								try {
									f.createNewFile();
									System.out.println("File "+f.getName()+" created!\n");
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}


						}
						else if(op1==2)
						{
							System.out.println("Please enter folder name to be created:");
							String foldername=sc.next();
							File folder=new File(foldername);
							if(folder.exists())
							{
								System.out.println("Folder Already exists! Folder cannot be created!\n");
							}
							else
							{
								folder.mkdir();
								System.out.println("Folder "+folder.getName()+" created!\n");
							}
						}
						else
						{
							System.out.println("You have entered wrong choice!\n");
						}
						break;

					case 2:
						System.out.println("Do you want to delete file or folder?\n");
						System.out.println("1.File\n2.Folder\n");

						System.out.println("Enter the option:");
						int op2=sc.nextInt();

						if(op2==1)
						{

							System.out.println("Please enter file name to be deleted:");
							String finame=sc.next();
							File fi=new File(finame);

							if(fi.exists())
							{

								fi.delete();
								System.out.println(fi.getName()+" Deleted successfully!\n");

							}
							else
							{
								System.out.println("File doesn't exist!\n");
							}


						}
						else if(op2==2)
						{
							System.out.println("Please enter folder name to be deleted:");
							String foname=sc.next();
							File fo=new File(foname);


							if(fo.exists())
							{
								if(fo.exists())
								{

									fo.delete();
									System.out.println(fo.getName()+" Deleted successfully!\n");}

							}

							else
							{
								System.out.println("Folder doesn't exist!\n");
							}


						}
						else
						{
							System.out.println("You have entered wrong choice!\n");
						}
						break;

					case 3:
						try {
							File f3=new File("E:\\Eclipse\\Eclipse_Store\\First_Project\\");
							File arrayf[]=f3.listFiles();
							int flag=0,i;

							System.out.println("Enter file/folder name to be searched:");
							String search=sc.next();

							for(i=0;i<arrayf.length;i++)
							{

								if(arrayf[i].getName().startsWith(search))
								{
									flag=1;
									//System.out.println("Files/Folder is/are:\n"+arrayf[i]+" \n");
									break;
								}
								else
								{
									flag=0;
									//System.out.println("Couldn't find file/folder "+arrayf[i]+" \n");
								}
							}

							if(flag==1)
							{
								System.out.println("Files/Folder is/are:\n"+arrayf[i]+" \n");
							}

							if(flag==0) 
							{

								System.out.println("Couldn't find file/folder ");
							}
							break;
						}
						catch (Exception e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage());
						}

					case 4:
						break outer;

					case 5:
						System.out.println("Thank you for using this Application!\n");
						System.exit(0);

					default:
						System.out.println("You have entered wrong choice! Please enter correct choice!\n");
						break;

					}
				}


			case 3:
				System.out.println("Thank you for using this Application!\n");
				System.exit(0);

			default:
				System.out.println("You have entered wrong choice! Please enter correct choice!\n");

			}
		}

	}	

}


