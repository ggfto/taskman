package in.gf2.taskman.database.model;

import java.util.Map;

import lombok.Data;

@Data
public class QueryModel {
    String query;
    Map<String, Object> params;
}
