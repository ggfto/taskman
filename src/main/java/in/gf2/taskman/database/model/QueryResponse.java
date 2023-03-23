package in.gf2.taskman.database.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class QueryResponse {
    QueryModel query;
    int rows;
    boolean error;
}
