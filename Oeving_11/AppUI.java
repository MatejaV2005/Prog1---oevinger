package Oeving_11;
import static Oeving_11.InputHandler.readNumber;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AppUI {
  private final int ADD_PROPERTY = 1;
  private final int LIST_ALL_PROPERTIES = 2;
  private final int FIND_PROPERTY_BY_ID = 3;
  private final int LIST_PROPERTIES_BY_FARM_NR = 4;
  private final int CALCULATE_AVERAGE_AREA = 5;
  private final int DELETE_PROPERTY = 6;
  private final int COUNT_PROPERTIES = 7;
  private final int EXIT = 9;
  /**
   * Presents	the	menu	for	the	user,	and	awaits	input	from	the	user.	The	menu
   * choice	selected	by	the	user	is	being	returned.
   *
   * @return the  menu	choice	by	the	user	as	a	positive	number	starting	from	1.
   * If	0	is	returned,	the	user	has	entered	a	wrong	value
   */


  Scanner sc = new Scanner(System.in);
  PropertyRegister register = new PropertyRegister();

  private int showMenu() {
    int menuChoice = 0;
    System.out.println("\n***** Property Register Application v0.1 *****\n");
    System.out.println("1. Add property");
    System.out.println("2. List all properties");
    System.out.println("3. Find property by ID");
    System.out.println("4. List properties by farm number");
    System.out.println("5. Calculate average area");
    System.out.println("6. Delete property");
    System.out.println("7. Show total number of properties");
    System.out.println("9. Quit");
    System.out.println("\nPlease enter a number between 1 and 9.\n");


    menuChoice = (int) readNumber("int");
    return menuChoice;
  }

  /**
   *	Starts	the	application.	This	is	the	main	loop	of	the	application,
   *	presenting	the	menu,	retrieving	the	selected	menu	choice	from	the	user,
   *	and	executing	the	selected	functionality.
   */
  public	void	start()	{
    boolean	finished	=	false;
    init();
    //	The	while-loop	will	run	as	long	as	the	user	has	not	selected
    //	to	quit	the	application
    while	(!finished)	{
      int	menuChoice	=	this.showMenu();
      switch	(menuChoice)
      {
        case	ADD_PROPERTY:
          System.out.println("Enter the following:\n");

          System.out.println("Municipality: ");
          String municipality = sc.nextLine();

          System.out.println("Municiplaity number: ");
          int municipalityNumber = (int) readNumber("int"); //requires to return the datatype here since the readnumber method is defined as Number, which can generally represent any number

          System.out.println("Farm Number: ");
          int farmNumber = (int) readNumber("int");

          System.out.println("Plot Number: ");
          int plotNr = (int) readNumber("int");

          System.out.print("Name of Plot: ");
          String nameOfPlot = sc.nextLine();

          System.out.println("Area of Plot: ");
          double areaOfPlot = (double) readNumber("double");


          System.out.print("Owner: ");
          String owner = sc.nextLine();

          Property property = new Property(municipality, municipalityNumber, farmNumber, plotNr, nameOfPlot, areaOfPlot, owner);
          register.registerProperty(property);
          System.out.println("Property added successfully.");
          break;

        case	LIST_ALL_PROPERTIES:
          register.allProperties();
          break;

        case  FIND_PROPERTY_BY_ID:
          System.out.println("Enter the ID of the property you want to find in this format\n"
              + "(MunicipalityNr-FarmNr/PlotNr)\n:");
          String ID = sc.nextLine();

          register.propertyById(ID);
          break;

        case LIST_PROPERTIES_BY_FARM_NR:
          System.out.println("Enter the farm number of the property you want to find: \n");
          int farmNr = sc.nextInt();

          register.propertiesOfGivenFarmNr(farmNr);
          break;

        case	CALCULATE_AVERAGE_AREA:
          System.out.println("average area of all properties:\n");
          System.out.println(register.avgAreaOfProperties() + " Square metres");
          break;

        case DELETE_PROPERTY:
          System.out.println("Enter the properties unique ID to remove it: \n");
          String idToRemove= sc.nextLine();

          register.deleteProperty(idToRemove);
          break;

        case COUNT_PROPERTIES:
          System.out.println("Amount of properties registered:\n" +register.count());
          break;

        case	EXIT:
          System.out.println("Thank	you	for	using	the	Properties	app!\n");
          finished	=	true;
          break;

        default:
          System.out.println("Unrecognized  menu  selected!!!");
          break;
      }
    }
  }

  private void init() {
    //DUMMY VALUES
    Property property1 = new Property(
        "Oslo",           // Municipality
        301,              // Municipality Number
        12,               // Farm Number
        5,                // Plot Number
        "Central Park",   // Plot Name
        500.0,            // Area in square meters
        "Alice Johnson"   // Owner
    );

    // Dummy Property 2
    Property property2 = new Property(
        "Bergen",         // Municipality
        4601,             // Municipality Number
        7,                // Farm Number
        3,                // Plot Number
        "Mountain View",  // Plot Name
        1200.5,           // Area in square meters
        "Bob Andersen"    // Owner
    );

    // Dummy Property 3
    Property property3 = new Property(
        "Trondheim",      // Municipality
        5001,             // Municipality Number
        10,               // Farm Number
        2,                // Plot Number
        "Riverfront",     // Plot Name
        850.75,           // Area in square meters
        "Charlotte Li"    // Owner
    );

    register.registerProperty(property1);
    register.registerProperty(property2);
    register.registerProperty(property3);
    //-----------------------------------------------
  }
}




/*
* private int showMenu() {
    int menuChoice = 0;
    System.out.println("\n***** Property Register Application v0.1 *****\n");
    System.out.println("1. Add property");
    System.out.println("2. List all properties");
    System.out.println("3. Find property by ID");
    System.out.println("4. List properties by farm number");
    System.out.println("5. Calculate average area");
    System.out.println("6. Delete property");
    System.out.println("7. Show total number of properties");
    System.out.println("9. Quit");
    System.out.println("\nPlease enter a number between 1 and 9.\n");

    if (sc.hasNextInt()) {
      menuChoice = sc.nextInt();
      sc.nextLine();
    } else {
      System.out.println("You	must	enter	a	number,	not	text");
    }
    return menuChoice;
  }*/