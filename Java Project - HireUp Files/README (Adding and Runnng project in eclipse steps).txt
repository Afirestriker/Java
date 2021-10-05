
README (Adding and Runnng project in eclipse steps)

-----------------------------------------------------------------------------
First steps, 
Directly open the workspace and run project

	1. Start Eclipse -> Eclipse IDE Launcher
	
	2. Select a directory as Workspace

	3. open Workspace: 'Java Project - HireUp Workspace'

	NOTE: Select workspace folder as 'Java Project - HireUp Workspace'
	      and no any folder inside this.

	NOTE: The first file to run is 
		1. run as java application => src/main/java/hireupdb/CreateTables.java
		2. Run Tomcat server
		3. Run on server => src/main/webapp/JSP/Index.jsp

------------------------------------------------------------------------------
If above step does not works well, then next step is to import the project

Steps to correctly import HireUp project

1. Create a Eclipse workspace
	For Example: Java Project - HireUp

2. In menu item:
	From Project Explorer -> select 'Import proects...'
	OR,
	Goto -> File -> Import
	
3. Then, From Import Dialog box
	-> Expand General
	-> click on 'Existing Projects Into Workspace'

	
4. Then, Select Root Directory: <Location> Browse for it
	
	if, project is outside of current working workspace
		From Options section, checked 'Copy projects into workspace'
		And Click Finish

	else, Directly Click on Finish


5. NOW, check the folder in system explorer if project is seen with (.settings, bin, src, .classpath, .project) files
   
   If not, then its means that files are not copy into current project, but they are linked
   So, to avoid files linking and to actually copy files in project,
   Repeat step 4,
	Select Root Directory: <Location> Browse for it
	Then, from Options section, checked 'Copy projects into workspace'
	And Click on finish
	Now check folder in system explorer the files will be added in project and this way project will not have to depend on file whcih are outside the project
