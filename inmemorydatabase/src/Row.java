import java.util.Date;
import java.util.HashMap;

public class Row {
    private String rowId;
    private HashMap<String, Object> columnValueMap;
    private Date createdAt;
    private Date updatedAt;

    public Row(String rowId, HashMap<String, Object> columnsMap, Date createdAt, Date updatedAt){
        this.rowId = rowId;
        this.columnValueMap = columnsMap;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public HashMap<String, Object>  getColumnValueMap(){
        return columnValueMap;
    }

    public void setColumnValuesMap(HashMap<String, Object> columnValuesMap) {
        this.columnValueMap = columnValuesMap;
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
