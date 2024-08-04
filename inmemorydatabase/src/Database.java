import java.util.Date;
import java.util.HashMap;

public class Database {
    private String name;
    private HashMap<String, Table> tablesMap;
    private Date createdAt;

    public Database(String name){
        this.name = name;
        this.tablesMap = new HashMap<>();
        this.createdAt = new Date();
    }
    public Table createTable(String tableName){
        if(tablesMap.containsKey(tableName)){
            System.out.println("A table already exists with the given name");
        }else{
            Table table = new Table(tableName);
            tablesMap.put(tableName, table);
            System.out.println("Table successfully created");
        }
        return tablesMap.get(tableName);
    }
    public void dropTable(String tableName) {
        tablesMap.remove(tableName);
        System.out.println("Table successfully dropped");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Table> getTableHashMap() {
        return tablesMap;
    }

    public void setTableHashMap(HashMap<String, Table> tableHashMap) {
        this.tablesMap = tableHashMap;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
