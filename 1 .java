class Connection{
	
	public static void Main(String[] args)
	{
		Class.forName("com.mysql.jdbc.Driver");  //load driver

	//Createa connection
		String url="jdbc:mysql://localhost:3306/dbname";
		String uname="root";
		String pass="root";
	Connection conn=DriverManager.getConnection(url,uname,pass);
	if(conn!=null)
	{
		System.out.println("Connection done");
	}
	else
		System.out.println("Connection Not Done");

	//Write a query
	//1.Static Query
	String query="Insert into table_name values(1,"Pranav","Chandwad")";
	Statement stmt=conn.createStatement();
	stmt.execute(query);
	System.out.println("Data inserted Succesfully");

	//Dynamic Querry Value passing 
	String query="Insert into table_name values(?,?,?,?)";
	PreparedStatement pstmt=conn.prepareStatement();

	pstmt.setInt(1,1);
	pstmt.setString(2,"Pranav");
	pstmt.setString(3,"Chandwad");
	pstmt.setInt(4,"Nashik");
	pstmt.executeUpdate();
	System.out.println("Data Added Successfully");



	}

}