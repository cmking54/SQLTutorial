import java.util.regex.*;
// DO NOT EXECUTE; NOT FULL IMPLEM; MEANT FOR EDUCATION (FOR NOW)
class LikeEqual {
    public static boolean matches(String searchFor, String searchIn) {
        return Pattern.compile(searchFor).matcher(searchIn).matches();
    }
    public Table like(Table parent, int schema_index, String pattern) {
        for (Table.Row row: parent) {
            if (LikeEquals.matches(pattern, row.getAt(schema_index))) {
                child.append(row);
            }
        }
    }
    /*
    public static void
}
/*
class Table {
    Row[] rows;
    public Table(int init_cap) {
        rows = new Row[init_cap];
    }
    public void append(Row row) {
        if (this.matchesSchema(row)) {
            rows[Table.pointer++] = row;
        }
    }
    class Row {
*/        
