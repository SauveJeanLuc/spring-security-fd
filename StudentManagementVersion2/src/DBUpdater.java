import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class DBUpdater {

    String conString = "jdbc:mysql://localhost:3306/desktopApp";
    String username = "root";
    String password = "donatien";

    //INSERT INTO DB
    public Boolean add(String registrationNumber, String firstName, String lastName, String gender, String birth_date, String department_id) {
        //SQL STATEMENT
        String sql = "INSERT INTO student(registration_Number, first_name,last_name,gender, birth_date, department_id) VALUES('" + registrationNumber + "','" + firstName + "','" + lastName + "','" + gender + "','" + birth_date + "','" + department_id + "')";

        try {
            //GET COONECTION
            Connection con = DriverManager.getConnection(conString, username, password);

            // PREPARED STMT
            Statement s = con.prepareStatement(sql);

            s.execute(sql);

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //RETRIEVE DATA
    public DefaultTableModel getData() {
        //ADD COLUMNS TO TABLE MODEL
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("ID");
        dm.addColumn("Registration Number");
        dm.addColumn("First Name");
        dm.addColumn("Last Name");
        dm.addColumn("Gender");
        dm.addColumn("Birth Date");
        dm.addColumn("Department Id");

        //SQL STATEMENT
        String sql = "SELECT * FROM student";

        try {
            Connection con = DriverManager.getConnection(conString, username, password);

            //PREPARED STMT
            Statement s = con.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);

            //LOOP THRU GETTING ALL VALUES
            while (rs.next()) {
                //GET VALUES
                String id = rs.getString(1);
                String registration_number = rs.getString(2);
                String first_name = rs.getString(3);
                String last_name = rs.getString(4);
                String gender = rs.getString(5);
                String birth_date = rs.getString(6);
                String department_id = rs.getString(7);


                dm.addRow(new String[]{id, registration_number ,first_name, last_name, gender, birth_date, department_id});
            }

            return dm;

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;

    }

    //UPDATE DATA
    public Boolean update(String id, String name, String pos, String team) {
        //SQL STMT
        String sql = "UPDATE playerstb SET Name ='" + name + "',Position='" + pos + "',Team='" + team + "' WHERE ID='" + id + "'";

        try {
            //GET COONECTION
            Connection con = DriverManager.getConnection(conString, username, password);

            //STATEMENT
            Statement s = con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    //DELETE DATA
    public Boolean delete(String id)
    {
        //SQL STMT
        String sql="DELETE FROM playerstb WHERE ID ='"+id+"'";

        try
        {
            //GET COONECTION
            Connection con=DriverManager.getConnection(conString, username, password);

            //STATEMENT
            Statement s=con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        }catch(Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }

}