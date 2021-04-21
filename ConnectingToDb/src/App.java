import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

public class App {
    private JFrame jFrame;

    public App()  {
        this.init();
    }

    public void init()  {
     jFrame = new JFrame("CRUD");
     JPanel jPanel = new JPanel();
     jFrame.setSize(500,200);

     try {

         ResultSet rs =Db.getStatement().executeQuery("SELECT * FROM users");

         String column[]={"ID","NAME","SALARY"};


         JTable table = new JTable(buildModel(rs));

        jPanel.add(table);

     }catch (SQLException e){
         e.printStackTrace();
     }

     jFrame.add(jPanel);
     jFrame.setVisible(true);

    }

    public static DefaultTableModel buildModel(ResultSet rs)  {

        Vector<String> columnNames = new Vector<String>();
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();

        try{
            ResultSetMetaData metaData = rs.getMetaData();

            int columnCount = metaData.getColumnCount();
            System.out.println("Column count: "+metaData.getColumnCount());

            for (int column = 1;column <= columnCount;column++){
                columnNames.add(metaData.getColumnClassName(column));
            }



            while (rs.next()) {
                Vector<Object> vector = new Vector<Object>();
                for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                    vector.add(rs.getObject(columnIndex));
                }
                data.add(vector);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return new DefaultTableModel(data,columnNames);
    }
}
