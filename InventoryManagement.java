package database;

import java.sql.SQLException;

public class InventoryManagement {
	public static void main(String[] args) {
		try {
			DatabaseInterface.dbConnect();
			UIInterface.startApp();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			//System.out.println("finally");
			try {
				DatabaseInterface.dbDisconnect();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
