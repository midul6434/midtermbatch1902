package datastructure;

import db.DbConnection;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

/**
 * @author Jahidul Islam
 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
 * Use For Each loop and while loop with Iterator to retrieve data.
 * Store all the sorted data into one of the databases.
 *
 */


public class UseArrayList {

	public static  void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
		List<String>list = new ArrayList<>();
		list.add("Midul");
		list.add("Abir");
		list.add("Joy");
		list.add("Akter");

		System.out.println("Add " + list);
		System.out.println("peek "+ list.get(0));
		System.out.println("Remove "+ list.remove(2));
		System.out.println("retrieve elements"+list);

		Iterator<String>iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());


		}
		Collections.sort(list);
		System.out.println(list);
		/*List<String>list1=new ArrayList<>();
		list1=list;

		DbConnection dbConnection= new DbConnection();
		dbConnection.createTableFromStringToMySql("array","element");


		dbConnection.insertDataFromArrayListToMySql(list,"array","element");
		List<String> std = dbConnection.readDatabase("array","element");
		for(String str: std){
			System.out.println(str);
		}
*/
	}
}